package com.lld.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Auditorium extends BaseModel {
    private String name;
    @OneToMany
    private List<Seat> seatList;
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> featureList;

//    @OneToMany
//    private List<Show> showList;
//    @OneToOne
//    private Show currentShow;
}
