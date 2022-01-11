package com.hotel.mail.service;

import com.hotel.mail.model.Email;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import org.springframework.web.bind.annotation.PathVariable;

public interface MailService {

    int sendEmail(String roomName, int payablePrice, int discountPrice,  String email) throws MailjetSocketTimeoutException, MailjetException;
}
