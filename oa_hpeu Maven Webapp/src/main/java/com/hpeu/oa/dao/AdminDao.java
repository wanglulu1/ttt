package com.hpeu.oa.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.hpeu.oa.entity.Admin;


public interface AdminDao extends BaseDao<Admin> {
	/**
	 * 通过邮箱查询用户是否存在
	 */
	public Admin quiryEmail(@Param("email") String email, @Param("password") String password);

	/**
	 * 通过手机号查询用户是否存在
	 */
	public Admin quiryPhone(@Param("phone") String phone, @Param("password") String password);

	/**
	 * 通过工号查询用户是否存在
	 */
	public Admin quiryJobNumber(@Param("jobNumber") String email, @Param("password") String password);
}
