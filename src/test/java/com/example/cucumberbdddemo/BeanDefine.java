package com.example.cucumberbdddemo;

import com.example.cucumberbdddemo.bean.Postbox;
import com.example.cucumberbdddemo.bean.PostboxImpl;
import com.example.cucumberbdddemo.bean.SendEmailService;
import com.example.cucumberbdddemo.bean.SendEmailServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanDefine {
    @Bean
    @Scope("cucumber-glue")
    public Postbox newUser(){
        return new PostboxImpl();
    }
    @Bean
    public SendEmailService sendEmailService(ApplicationContext context){
        return new SendEmailServiceImpl(context);
    }
}
