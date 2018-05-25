package com.honghui.java.admin.service.impl;

import com.honghui.java.admin.dao.IUserDao;
import com.honghui.java.admin.service.IUserService;
import com.honghui.java.admin.vo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService implements IUserService {

    @Resource
    private IUserDao userDao;

    @Override
    public User findById(Integer userid) {
        return userDao.findById(userid);
    }

    @Override
    public boolean addUser(User user) {
        int result=userDao.addUser(user);
        return (result>0)?true:false;
    }

    @Override
    public boolean removeUser(Integer userid) {
        int result=userDao.removeUser(userid);
        return (result>0)?true:false;
    }

    @Override
    public boolean updateUser(User user) {
        int result=userDao.updateUser(user);
        return (result>0)?true:false;
    }
}
