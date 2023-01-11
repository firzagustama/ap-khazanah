package corp.bi.go.id.ap.khazanah.service;

import corp.bi.go.id.ap.khazanah.KhazanahApplicationTest;
import corp.bi.go.id.ap.khazanah.grpc.AllKhazanahRequest;
import corp.bi.go.id.ap.khazanah.grpc.AllKhazanahResponse;
import corp.bi.go.id.ap.khazanah.grpc.KhazanahServiceGrpc;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class KhazanahServiceTest extends KhazanahApplicationTest {

    @Autowired
    private KhazanahServiceGrpc.KhazanahServiceBlockingStub khazanahBlockingStub;

    @Test
    public void getAllKhazanah_success() {
        AllKhazanahResponse response = khazanahBlockingStub.getAllKhazanah(AllKhazanahRequest.newBuilder().build());

        assertEquals(response.getKhazanahCount(), 3);
        assertEquals(response.getKhazanah(0).getId(), "0B503C70-6F78-4F44-A060-1A000D6CB0E6");
    }
}
