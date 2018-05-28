package com.hpeu.oa.service;

import com.hpeu.oa.entity.Admin;

public interface AdminService {
	/**
     * 查找用户是否存在  ---通过  邮箱验证，工号验证，电话验证
     */
    public boolean quiryAdmin(Admin email);
}
