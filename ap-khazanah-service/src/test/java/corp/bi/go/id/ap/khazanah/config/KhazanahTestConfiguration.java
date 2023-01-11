package corp.bi.go.id.ap.khazanah.config;

import corp.bi.go.id.ap.khazanah.grpc.KhazanahServiceGrpc;
import corp.bi.go.id.ap.khazanah.service.KhazanahService;
import io.grpc.ManagedChannel;
import io.grpc.Server;
import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.inprocess.InProcessServerBuilder;
import io.grpc.testing.GrpcCleanupRule;
import org.junit.Rule;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

@TestConfiguration
public class KhazanahTestConfiguration {
    @Rule
    public final GrpcCleanupRule grpcCleanup = new GrpcCleanupRule();

    @Bean
    public String serverName() {
        return InProcessServerBuilder.generateName();
    }

    @Bean
    public Server server(String serverName) throws IOException {
        return InProcessServerBuilder.forName(serverName).directExecutor().addService(new KhazanahService()) // add if there are new service
                .build().start();
    }

    @Bean
    public ManagedChannel clientChannel(String serverName) {
        return InProcessChannelBuilder.forName(serverName).directExecutor().build();
    }

    @Bean
    public KhazanahServiceGrpc.KhazanahServiceBlockingStub khazanahBlockingStub(Server server, ManagedChannel clientChannel) {
        grpcCleanup.register(server);
        return KhazanahServiceGrpc.newBlockingStub(grpcCleanup.register(clientChannel));
    }
}
