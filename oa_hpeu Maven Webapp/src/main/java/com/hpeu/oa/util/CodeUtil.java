package com.hpeu.oa.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CodeUtil {

	 private static int width = 140;// 定义图片的width
	    private static int height = 50;// 定义图片的height
	    private static int codeCount = 4;// 定义图片上显示验证码的个数

	    private static int xx = 22;  //间距
	    private static int fontHeight = 20; //大小
	    private static int codeY = 34;//Y轴坐标
	    private static char[] codeSequence1 = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890".toCharArray();
	    private static char[] codeSequence = {
	            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
	            'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
	            'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0',
	            '1', '2', '3', '4', '5', '6', '7', '8', '9'
	    };

	    /**
	     * 生成一个map集合
	     * code为生成的验证码
	     * codePic为验证码BufferedImage对象
	     *
	     * @return
	     */
	    public static Map<String, Object> generateCodeAndPic() {
	        //定义图像buffer
	        BufferedImage bufferedImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);
	        //创建一个画板
	        Graphics gd = bufferedImg.getGraphics();
	        //创建一个随机数生成类
	        Random random = new Random();
	        //设置颜色----将图片填充为白色
	        gd.setColor(Color.white);
	        //指定画刷填充矩形 从0,0
	        gd.fillRect(0, 0, width, height);

	        //创建字体，字体大小更具图片的高度来定   字体为：Fixedsys 加粗 大小18号
	        Font font = new Font("微软雅黑", Font.BOLD, fontHeight);
	        //设置字体
	        gd.setFont(font);

	        //画边框
	        gd.setColor(Color.white);
	        gd.drawRect(0, 0, width - 1, height - 1);

	        //随机产生30条干扰线，使图像中的认证码不易被其他程序探测到
	        gd.setColor(Color.LIGHT_GRAY);
	        for (int i = 0; i < 30; i++) {
	            int x = random.nextInt(width);
	            int y = random.nextInt(height);
	            // 绘制1*1大小的矩形
	            gd.drawRect(x, y, 1, 1);
	        }

	        //randomCode用于保存随机产生的验证码，以便用户登录后进行验证.
	        StringBuffer randomCode = new StringBuffer();
	        int red = 0;
	        int green = 0;
	        int blue = 0;
	        for (int i = 0; i < codeCount; i++) {
	            //得到随机产生的验证码数字
	            String code = String.valueOf(codeSequence1[random.nextInt(62)]);

	            //产生随机颜色分量来构造颜色值，这样输出每位数字的颜色值都将不同。
	            red = random.nextInt(255);
	            green = random.nextInt(255);
	            blue = random.nextInt(255);

	            // 用随机产生的颜色将验证码绘制到图像中。
	            gd.setColor(new Color(red, green, blue));
	            //code:要绘制的字符串  x坐标  y坐标
	            gd.drawString(code, (i + 1) * xx, codeY);

	            //将产生四个随机数组合在一起
	            randomCode.append(code);
	        }
	        Map<String, Object> map = new HashMap<String, Object>();
	        //存放验证码
	        map.put("code", randomCode);
	        //存放验证码图像
	        map.put("codePic", bufferedImg);
	        return map;
	    }


}
