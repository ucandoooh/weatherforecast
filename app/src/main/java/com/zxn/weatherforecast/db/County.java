package com.zxn.weatherforecast.db;

import org.litepal.crud.DataSupport;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class County extends DataSupport {

    private int id;

    private String countyName;

    private String weatherId;

    private int cityId;
}
