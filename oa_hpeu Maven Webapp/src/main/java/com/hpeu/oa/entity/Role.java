package com.hpeu.oa.entity;

public class Role {
	 //id
    private int id;
    //角色 --  管理员  讲师  助教 后勤  采购员
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
