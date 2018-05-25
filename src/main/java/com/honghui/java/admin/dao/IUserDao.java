package com.honghui.java.admin.dao;

import com.honghui.java.admin.vo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao {
    public User findById(Integer userid);

    public int addUser(User user);

    public int removeUser(Integer userid);

    public int updateUser(User user);
}
