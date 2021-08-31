package com.example.springboot.es.service;

import com.example.springboot.es.bean.TestBean;

import java.util.List;

/**
 * @author yangzheng
 * @description
 * @date 2020/11/4 00416:06
 */
public interface TestService {
    Iterable<TestBean> findAll();

    void save(List<TestBean> list);

    void save(TestBean bean);

    List<TestBean> findByName(String text);

    List<TestBean> findByNameOrDesc(String  text);

    List<TestBean> templateQuery(String text);
}
