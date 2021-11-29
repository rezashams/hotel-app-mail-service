package com.hotel.mail.service;

import com.hotel.mail.model.Email;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

public interface MailService {

    int sendEmail(Email email) throws MailjetSocketTimeoutException, MailjetException;
}
