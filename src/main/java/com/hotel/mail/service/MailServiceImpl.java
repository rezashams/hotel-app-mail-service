/*
 * Copyright (c) 2021 Birmingham City University. All rights reserved.
 * Author:  Reza Shams (rezashams86@gmail.com)
 */
package com.hotel.mail.service;

import com.hotel.mail.model.Email;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService{

    private final MailJitService mailJitService;

    public MailServiceImpl(MailJitService mailJitService) {
        this.mailJitService = mailJitService;
    }

    @Override
    public String sendEmail(Email email) {
        return null;
    }
}
