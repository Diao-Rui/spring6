package javai18n;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @Author: Diao Rui
 * @className: JavaI18n
 * @Description: TODO
 * @DateTime: 2023/8/10 10:45
 * @version: 1.0
 **/
public class JavaI18n {
    public static void main(String[] args) {
        //获取国际化配置中的数据
        ResourceBundle bundle = ResourceBundle
                .getBundle("messages", new Locale("zh", "CN"));
        System.out.println("English：" + ResourceBundle
                .getBundle("messages", new Locale("en", "GB"))
                .getString("dr"));
        System.out.println("中文：" + ResourceBundle
                .getBundle("messages", new Locale("zh", "CN"))
                .getString("dr"));
    }
}
