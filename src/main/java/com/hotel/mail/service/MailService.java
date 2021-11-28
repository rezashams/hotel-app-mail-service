package com.hotel.mail.service;

import com.hotel.mail.model.Email;

public interface MailService {

    String sendEmail(Email email);
}
