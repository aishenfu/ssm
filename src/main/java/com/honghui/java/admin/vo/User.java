package com.honghui.java.admin.vo;

public class User {
    public Integer userid;
    public String username;
    public Integer age;
    public Integer phone;
    public String sex;
    public String address;

    public User()
    {
    }

    public User(String username, Integer age, Integer phone, String sex, String address) {
        this.username = username;
        this.age = age;
        this.phone = phone;
        this.sex = sex;
        this.address = address;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
