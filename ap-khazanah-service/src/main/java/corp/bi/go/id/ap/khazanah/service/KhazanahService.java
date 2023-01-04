package corp.bi.go.id.ap.khazanah.service;

import corp.bi.go.id.ap.khazanah.grpc.KhazanahRequest;
import corp.bi.go.id.ap.khazanah.grpc.KhazanahResponse;
import corp.bi.go.id.ap.khazanah.grpc.KhazanahServiceGrpc;
import corp.bi.go.id.ap.khazanah.grpc.UpdateOrderQuotaRequest;
import corp.bi.go.id.ap.khazanah.model.Khazanah;
import corp.bi.go.id.ap.plugin.helper.JsonUtil;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.ArrayList;
import java.util.List;

@GrpcService
public class KhazanahService extends KhazanahServiceGrpc.KhazanahServiceImplBase {

    private final List<KhazanahResponse> db;

    public KhazanahService() {
        this.db = new ArrayList<>();
        db.add(KhazanahResponse.newBuilder()
                .setId("0B503C70-6F78-4F44-A060-1A000D6CB0E6")
                .setType("Bank Indonesia")
                .setName("KPw BI Sibolga")
                .setAddress("JL. KAPTEN MARULI SITORUS NO.8, SIBOLGA")
                .setOrderQuota(100)
                .setStatus("Aktif")
                .build());
        db.add(KhazanahResponse.newBuilder()
                .setId("0CF2657B-5CAB-4D1D-BAFC-38C02B47F9C5")
                .setType("Bank Indonesia")
                .setName("KPw BI Prov. Jawa Tengah - Semarang")
                .setAddress("Jl. Imam Bardjo SH no.4")
                .setOrderQuota(100)
                .setStatus("Aktif")
                .build());
        db.add(KhazanahResponse.newBuilder()
                .setId("13E75146-6D30-4E9C-B88C-7BA945589D10")
                .setType("Bank Indonesia")
                .setName("KPw BI Cirebon")
                .setAddress("JL. YOS SUDARSO NO.5-7, CIREBON")
                .setOrderQuota(100)
                .setStatus("Aktif")
                .build());
    }

    @Override
    public void getKhazanah(KhazanahRequest request, StreamObserver<KhazanahResponse> responseObserver) {
        responseObserver.onNext(db.stream()
                .filter(k -> k.getId().equalsIgnoreCase(request.getId()))
                .findFirst()
                .orElse(KhazanahResponse.newBuilder().build()));
        responseObserver.onCompleted();
    }

    @Override
    public void updateOrderQuota(UpdateOrderQuotaRequest request, StreamObserver<KhazanahResponse> responseObserver) {
        super.updateOrderQuota(request, responseObserver);
    }

    @KafkaListener(id = "updateKhazanahOrderQty_consumer", topics = "updateKhazanahOrderQty")
    public void updateOrderQuotaAsync(String message) {
        System.out.println("Message in " + message);

        Khazanah k = JsonUtil.fromString(message, Khazanah.class);

        // update db
        for (int i = 0; i < db.size(); i++) {
            KhazanahResponse kr = db.get(i);
            if (!kr.getId().equalsIgnoreCase(k.getKhazanahId())) continue;

            db.set(i, kr.toBuilder().setOrderQuota(kr.getOrderQuota() - k.getOrderQty()).build());
            break;
        }
        System.out.println("Updated Khazanah Quota");
    }
}
