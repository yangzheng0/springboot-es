package com.example.springboot.es;

import com.example.springboot.es.bean.TestBean;
import com.example.springboot.es.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class SpringbootEsApplicationTests {

    @Autowired
    TestService testService;

    @Test
    public void contextLoads() {
        List<TestBean> list = new ArrayList<>();
        testService.save(list);
    }

}
