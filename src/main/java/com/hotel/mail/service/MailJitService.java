package com.hotel.mail.service;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

public interface MailJitService {

    String sendEmail(String from, String to, String subject, String Body) throws MailjetSocketTimeoutException, MailjetException;


}

