package com.lld.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Ticket extends BaseModel {
    private int amount;
    private Date timeOfBooking;
    private List<Seat> seatList;
    private User bookedBy;
    private Show show;
    private List<Payment> paymentList;
    private TicketStatus status;
}
