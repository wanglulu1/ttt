package com.hpeu.oa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hpeu.oa.dao.AdminDao;
import com.hpeu.oa.entity.Admin;
import com.hpeu.oa.service.AdminService;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;

	/**
	 * 查找用户是否存在 ---邮箱验证，工号验证，电话验证
	 *
	 * @param admin
	 */
	@Override
	public boolean quiryAdmin(Admin admin) {
		// 通过邮箱验证
		if (admin.getEmail() != null && admin.getEmail() != "") {
			if (adminDao.quiryEmail(admin.getEmail(), admin.getPassword()) != null) {
				return true;
			}
		}
		// 通过手机验证
		if (admin.getPhone() != null && admin.getPhone() != "") {
			if (adminDao.quiryPhone(admin.getPhone(), admin.getPassword()) != null) {
				System.out.println("--true--");
				return true;
			}
		}

		// 通过工号验证
		if (admin.getJobNumber() != null && admin.getJobNumber() != "") {
			if (adminDao.quiryJobNumber(admin.getJobNumber(), admin.getPassword()) != null) {
				return true;
			}
		}
		System.out.println("--false--");
		return false;
	}

}
