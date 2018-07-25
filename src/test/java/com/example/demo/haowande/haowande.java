package com.example.demo.haowande;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class haowande {
    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    public void haowande1() throws InterruptedException {
        Thread.sleep(5000);
        SimpleMailMessage message = new SimpleMailMessage();
        for(int i=0;i<100;i++){
            message.setSubject("臭傻逼");
            message.setText("胖子  三B  小朋友   我爱你  宝贝 么么哒  ");
            message.setTo("2431368282@qq.com","337671589@qq.com","610050884@qq.com");
            message.setFrom("oanwmm@qq.com");
            mailSender.send(message);
        }


    }
}
