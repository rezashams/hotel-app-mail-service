/*
 * Copyright (c) 2021 Birmingham City University. All rights reserved.
 * Author:  Reza Shams (rezashams86@gmail.com)
 */
package com.hotel.mail.controller;

import com.hotel.mail.model.Email;
import com.hotel.mail.service.MailService;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MailController {

    private final MailService  mailService;

    public MailController(MailService mailService) {
        this.mailService = mailService;
    }


    @PostMapping("mail/send")
    public ResponseEntity<Integer>  sendMail(@RequestBody Email email) {
        int result;
        try {
            result = mailService.sendEmail(email);
        } catch (MailjetSocketTimeoutException | MailjetException e) {
            result=500;
            e.printStackTrace();
        }
        return  new ResponseEntity<>(result,HttpStatus.CREATED);
    }

}
