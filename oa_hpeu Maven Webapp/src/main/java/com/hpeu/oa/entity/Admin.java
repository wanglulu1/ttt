package com.hpeu.oa.entity;

import java.sql.Timestamp;

public class Admin {
	//id
    private int id;
    //工号
    private String jobNumber;
    //姓名
    private String name;
    //密码
    private String password;
    //电话
    private String phone;
    //性别
    private Integer sex;
    //年龄
    private Integer age;
    //创建时间
    private Timestamp createDate;
    //邮箱
    private String email;
    //角色表
    private Role role;
    //页面资源表
    private PageResource pageResource;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public PageResource getPageResource() {
        return pageResource;
    }

    public void setPageResource(PageResource pageResource) {
        this.pageResource = pageResource;
    }


    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", jobNumber='" + jobNumber + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", createDate=" + createDate +
                ", email='" + email + '\'' +
                ", role=" + role +
                ", pageResource=" + pageResource +
                '}';
    }
}
