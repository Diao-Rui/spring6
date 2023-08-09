package com.test;

import com.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
/**
 * @Author: Diao Rui
 * @className: Test
 * @Description: TODO
 * @DateTime: 2023/8/8 14:24
 * @version: 1.0
 **/
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class Test {
    //依赖注入
    @Autowired
    private static CatService catService;
}
