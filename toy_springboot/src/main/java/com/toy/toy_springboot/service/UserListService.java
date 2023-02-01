package com.toy.toy_springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toy.toy_springboot.dao.UserListDao;

@Service
public class UserListService {
    @Autowired
    UserListDao userListDao;

    public Object getList(Object dataMap) {
        String sqlMapId = "UserList.selectListByUID";

        Object result = userListDao.getList(sqlMapId, dataMap);
        return result;

    }

}
