package com.hpeu.oa.controller;

import java.awt.image.RenderedImage;
import java.io.IOException;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hpeu.oa.util.CodeUtil;

@Controller
public class CodeController {
	@RequestMapping(value = "code", method = RequestMethod.GET)
    public String code(HttpServletResponse response, HttpSession Session){
        // 调用工具类生成的验证码和验证码图片
        Map<String, Object> codeMap = CodeUtil.generateCodeAndPic();
        // 将四位数字的验证码保存到Session中。
        Session.setAttribute("code",codeMap.get("code").toString());
        // 将图像输出到Servlet输出流中。
        ServletOutputStream sos;

        try {
            sos = response.getOutputStream();
            ImageIO.write((RenderedImage) codeMap.get("codePic"), "jpeg", sos);
            sos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
