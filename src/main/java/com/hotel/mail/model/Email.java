/*
 * Copyright (c) 2021 Birmingham City University. All rights reserved.
 * Author:  Reza Shams (rezashams86@gmail.com)
 */
package com.hotel.mail.model;

import java.util.Date;
import java.util.List;

public class Email {

    private String emailAddress;
    private String subject;
    private String roomName;
    private int roomPrice;
    private Date fromDate;
    private Date toDate;
    private int studentDiscount;
    private int totalPrice;
    private List<DateDiscount> dateDiscounts;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(int roomPrice) {
        this.roomPrice = roomPrice;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public int getStudentDiscount() {
        return studentDiscount;
    }

    public void setStudentDiscount(int studentDiscount) {
        this.studentDiscount = studentDiscount;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<DateDiscount> getDateDiscounts() {
        return dateDiscounts;
    }

    public void setDateDiscounts(List<DateDiscount> dateDiscounts) {
        this.dateDiscounts = dateDiscounts;
    }
}
