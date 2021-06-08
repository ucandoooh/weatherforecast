package com.zxn.weatherforecast.db;

import lombok.Data;

@Data
public class Country {

    private int id;

    private String countryName;

    private String weatherId;

    private int cityId;
}
