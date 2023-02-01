package com.toy.toy_springboot.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserListDao {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public Object getList(String sqlMapId, Object datamap) {
        Object result = sqlSessionTemplate.selectList(sqlMapId, datamap);
        return result;
    }
}
