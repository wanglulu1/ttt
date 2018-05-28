package com.hpeu.oa.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hpeu.oa.entity.Admin;
import com.hpeu.oa.service.AdminService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping(value = "user")
public class AdminController {
	@Autowired
    private AdminService adminService;


    /**
     * 跳转登录页面
     *
     * @return
     */
    @RequestMapping(value = "goLogin", method = RequestMethod.GET)
    public String goLogin() {
        return "login";
    }

    /**
     * 登录验证
     */
    @RequestMapping(value = "loginAttestation", method = RequestMethod.POST)
    @ResponseBody
    public String loginAttestation(Admin admin, String code, HttpSession session) {
        Map<String, String> map = new HashMap<>();
        if (!session.getAttribute("code").toString().equalsIgnoreCase(code)) {
            map.put("info","验证码错误！");
            map.put("zt","Nc");
            System.out.println(JSONObject.fromObject(map).toString());
            return JSONObject.fromObject(map).toString();
        }

        System.out.println(admin);
        System.out.println(code);
        return "login";
    }
}
