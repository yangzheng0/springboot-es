package com.example.springboot.es.controller;

import com.example.springboot.es.bean.TestBean;
import com.example.springboot.es.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yangzheng
 * @description
 * @date 2020/11/4 00416:05
 */
@RestController
@RequestMapping
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("list")
    public String save() {
        List<TestBean> list = null;
        testService.save(list);

        return "success";
    }

    @RequestMapping("findAll")
    public Iterable<TestBean> findAll() {

        return testService.findAll();
    }

    @RequestMapping("findByName")
    public List<TestBean> findByName(String name) {
        return testService.findByName(name);
    }

    @RequestMapping("findByNameOrDesc")
    public List<TestBean> findByNameOrDesc(String text) {
        return testService.findByNameOrDesc(text);
    }

    @RequestMapping("templateQuery")
    public List<TestBean> templateQuery(String text) {
        return testService.templateQuery(text);
    }

}
