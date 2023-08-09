import com.service.CatService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Author: Diao Rui
 * @className: CatTest
 * @Description: TODO
 * @DateTime: 2023/8/8 14:31
 * @version: 1.0
 **/
//方式一
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:beans.xml")
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class CatTest {
    @Autowired
    private CatService catService;
    @Test
    public void test(){
        catService.show();
    }
}
