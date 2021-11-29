/*
 * Copyright (c) 2021 Birmingham City University. All rights reserved.
 * Author:  Reza Shams (rezashams86@gmail.com)
 */
package com.hotel.mail.service;

import com.hotel.mail.model.Email;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService{

    private final MailJitService mailJitService;
    private final static String emailFrom ="reza.shams@mail.bcu.ac.uk";
    public MailServiceImpl(MailJitService mailJitService) {
        this.mailJitService = mailJitService;
    }

    @Override
    public int sendEmail(Email email) throws MailjetSocketTimeoutException, MailjetException {
        return mailJitService.sendEmail(emailFrom,email.getEmailAddress(),email.getSubject(), email.getBody());
    }
}
