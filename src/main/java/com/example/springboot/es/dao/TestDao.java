package com.example.springboot.es.dao;

import com.example.springboot.es.bean.TestBean;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


/**
 * @author: yangzheng
 * 继承CRUD，第一个泛型是实体类类型，第二个泛型是id的类型
 */
public interface TestDao extends CrudRepository<TestBean, Long> {
    List<TestBean> findByName(String name);

    List<TestBean> findByNameOrDesc(String name,String desc);
}

