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
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/api/v1")
public class MailController {

    private final MailService  mailService;

    public MailController(MailService mailService) {
        this.mailService = mailService;
    }


    @RequestMapping(value = "/mail/send/{roomName}/{payablePrice}/{email}/{discountPrice}",method = RequestMethod.GET, produces = { "application/xml", "text/xml" }, consumes = MediaType.ALL_VALUE )
    public String  sendMail(@PathVariable("roomName") String roomName, @PathVariable("payablePrice") int payablePrice, @PathVariable("discountPrice") int discountPrice, @PathVariable("email") String email) {
        int result;
        System.out.println("Start sending mail");
        try {
            result = mailService.sendEmail(roomName,payablePrice,discountPrice, email);
        } catch (MailjetSocketTimeoutException | MailjetException e) {
            result=500;
            e.printStackTrace();
        }
        return  "true";
    }



}
