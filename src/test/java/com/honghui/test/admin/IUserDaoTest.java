//package com.honghui.test.admin;
//
//import com.honghui.java.admin.dao.UserDao;
//import com.honghui.java.admin.vo.User;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:spring-mybatis.xml")
//public class IUserDaoTest {
//    @Autowired
//    private UserDao dao;
//
//    @Test
//    public void testSelcetUser(){
//        int id=1;
//        User user=dao.findById(id);
//        System.out.println(user.getUsername());
//    }
//}