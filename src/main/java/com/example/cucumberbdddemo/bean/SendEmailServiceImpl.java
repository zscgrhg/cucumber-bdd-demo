package com.example.cucumberbdddemo.bean;

import org.springframework.context.ApplicationContext;

public class SendEmailServiceImpl implements SendEmailService {

    private final ApplicationContext context;

    public SendEmailServiceImpl(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void send(Email email) {
        getPostbox().putIn(email);
    }

    private Postbox getPostbox() {
        return context.getBean(Postbox.class);
    }
}
