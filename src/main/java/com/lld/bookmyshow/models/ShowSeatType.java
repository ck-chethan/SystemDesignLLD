package com.lld.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowSeatType extends BaseModel {
    private Show show;
    private Seat seat;
    private SeatStatus status;
}
