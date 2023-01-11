package corp.bi.go.id.ap.khazanah;

import corp.bi.go.id.ap.khazanah.config.KhazanahTestConfiguration;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@Import(KhazanahTestConfiguration.class)
public abstract class KhazanahApplicationTest {

}
