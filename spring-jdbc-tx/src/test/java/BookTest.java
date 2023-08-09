import com.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Author: Diao Rui
 * @className: BookTest
 * @Description: TODO
 * @DateTime: 2023/8/8 17:33
 * @version: 1.0
 **/
@SpringJUnitConfig(locations = "classpath:spring.xml")
public class BookTest {
    @Autowired
    private BookController controller;

    @Test
    public void test() {
        controller.buyBook(1, 1, 10);
    }

    @Test
    public void testCheck() {
        Integer[] bookIds = new Integer[]{1, 2};
        controller.checkout(1, bookIds);
    }

}
