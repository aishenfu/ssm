package com.honghui.java.admin.mvc;

import com.honghui.java.admin.service.IUserService;
import com.honghui.java.admin.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

//    @RequestMapping(value = "/addUser")
//    public ModelAndView addUser(@RequestParam("username") String username,
//    @RequestParam("age") int age,@RequestParam("sex") String sex,
//    @RequestParam("phone") int phone,@RequestParam("address") String address){
//        User user=new User(username,age,phone,sex,address);
//        userService.addUser(user);
//        return null;
//    }

    @RequestMapping(value = "/findById")
    public ModelAndView findById(HttpServletRequest request){
        System.out.println(userService);
        int userid=Integer.parseInt(request.getParameter("userid"));
        User user=userService.findById(userid);
        System.out.println("============="+user.getUsername());
        return null;
    }


}
