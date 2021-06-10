package com.zxn.weatherforecast.db;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.litepal.crud.DataSupport;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class City extends DataSupport {

    @Expose(deserialize = false)
    private int id;

    private String cityName;

    @SerializedName("id")
    private int cityCode;

    private int provinceId;
}
