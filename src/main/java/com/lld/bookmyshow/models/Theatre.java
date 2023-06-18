package com.lld.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Theatre extends BaseModel{
    private String name;
    private String address;
    private List<Auditorium> auditoriumList;
    private City city;
}
