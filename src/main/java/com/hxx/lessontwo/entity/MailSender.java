package com.hxx.lessontwo.entity;

import java.util.Properties;

public class MailSender {

    private static MailEntity mail = new MailEntity();

    /**
     * 设置邮件title
     */
    public MailSender title(String title) {
        mail.setTitle(title);
        return this;
    }

    /**
     * 设置邮件内容
     */
    public MailSender content(String content) {
        mail.setContent(content);
        return this;
    }

    /**
     * 设置邮件格式
     */
    public MailSender content(MailContentTypeEnum typeEnum) {
        mail.setContentType(typeEnum.getValue());
        return this;
    }

    public void send() throws Exception {

        if (mail.getContentType() == null) {
            mail.setContentType(MailContentTypeEnum.HTML.getValue());
        }
        if (mail.getTitle() == null||mail.getTitle().trim().length()==0) {
            throw new Exception("邮件标题没有设置");
        }
        if (mail.getContent() == null||mail.getContent().trim().length()==0) {
            throw new Exception("邮件内容没有设置");
        }
        if (mail.getList().size() == 0) {
            throw new Exception("没有接受者邮件地址");
        }




    }

}