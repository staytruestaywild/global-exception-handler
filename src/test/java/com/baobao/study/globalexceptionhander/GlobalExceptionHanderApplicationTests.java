package com.baobao.study.globalexceptionhander;

import com.baobao.study.globalexceptionhander.enums.ResponseEnum;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class GlobalExceptionHanderApplicationTests {

    @Test
    void contextLoads() {
        ResponseEnum.LICENCE_NOT_FOUND.assertNotNull(null, "");
    }

}
