package com.lld.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class City extends BaseModel {
    private List<Theatre> theatreList;
    private String name;



}
