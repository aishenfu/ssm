package com.honghui.java.admin.service;

import com.honghui.java.admin.vo.User;

public interface IUserService {
    public User findById(Integer userid);

    public boolean addUser(User user);

    public boolean removeUser(Integer userid);

    public boolean updateUser(User user);
}
