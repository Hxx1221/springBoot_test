package com.hxx.lessontwo.entity;

import java.util.ArrayList;

/**
 * @Author:He_xixiang
 * @Title: ${enclosing_method}
 * @Description: ${todo}(这里用一句话描述这个方法的作用)
 * @return ${return_type}    返回类型
 * @throws
 */
public class TestMain {

    public static void main(String[] args) throws Exception
    {
        new MailSender()
                .title("测试SpringBoot发送邮件")
                .content("简单文本内容发送")
                .contentType(MailContentTypeEnum.TEXT)
                .targets(new ArrayList<String>(){{
                    add("137125668@qq.com");
                }})
                .send();
    }

}
