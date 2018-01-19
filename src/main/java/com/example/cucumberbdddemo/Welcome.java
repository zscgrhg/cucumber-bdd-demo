package com.example.cucumberbdddemo;

import com.example.cucumberbdddemo.bean.Email;
import com.example.cucumberbdddemo.bean.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Welcome {
    @Autowired
    SendEmailService sendEmailService;

    public void sayHello(String someBody, String title, String content) {
        Email email = new Email();
        email.setContent(content);
        email.setTitle(title);
        email.setRecipients(someBody);
        sendEmailService.send(email);
    }
}
