/*
 * Copyright (c) 2021 Birmingham City University. All rights reserved.
 * Author:  Reza Shams (rezashams86@gmail.com)
 */
package com.hotel.mail.controller;

import com.hotel.mail.model.Email;
import com.hotel.mail.service.MailService;
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
    public ResponseEntity<String>  sendMail(@RequestBody Email email) {
        String result = mailService.sendEmail(email);

        return  new ResponseEntity<String>(result,HttpStatus.CREATED);
    }

}
