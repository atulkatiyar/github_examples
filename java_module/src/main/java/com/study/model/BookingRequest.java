package com.study.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BookingRequest {

    private String name;
    private int noOfGuests;
    private Date bookingDate;
    private String status;

}
