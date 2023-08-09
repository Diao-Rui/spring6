import com.config.SpringConfig;
import com.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Diao Rui
 * @className: TestAnno
 * @Description: TODO
 * @DateTime: 2023/8/9 11:41
 * @version: 1.0
 **/
public class TestAnno {
    @Test
    public void test() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        BookController bean = context.getBean(BookController.class);
        bean.buyBook(1, 1, 1);
    }
}
