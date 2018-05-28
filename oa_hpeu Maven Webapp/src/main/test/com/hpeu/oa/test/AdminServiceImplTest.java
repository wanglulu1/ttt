package com.hpeu.oa.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hpeu.oa.entity.Admin;
import com.hpeu.oa.service.AdminService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring-mybatis.xml")
public class AdminServiceImplTest {
	@Autowired
	AdminService adminService;

	@Test
	public void quiryEmail() {
		Admin admin = new Admin();
		admin.setEmail("1@1.com");
		admin.setPassword("123");
		System.out.println(admin);
		System.out.println(adminService.quiryAdmin(admin));
	}

	@Test
	public void quiryPhone() {
		Admin admin = new Admin();
		admin.setPhone("13098743918");
		admin.setPassword("123");
		System.out.println("----------------->>>>>>>>>>>>>>>"+adminService.quiryAdmin(admin));
	}

	@Test
	public void quiryJobNumber() {
		Admin admin = new Admin();
		admin.setJobNumber("a_001");
		admin.setPassword("123");
		System.out.println(admin);
		System.out.println(adminService.quiryAdmin(admin));
	}

}
