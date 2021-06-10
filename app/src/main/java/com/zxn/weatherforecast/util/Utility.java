package com.zxn.weatherforecast.util;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zxn.weatherforecast.db.City;
import com.zxn.weatherforecast.db.County;
import com.zxn.weatherforecast.db.Province;

import java.lang.reflect.Type;
import java.util.List;

public class Utility {

    public static boolean handleProvinceResponse(String respone) {
        if (!TextUtils.isEmpty(respone)) {
            Gson gson = new Gson();
            Type provinceListType = new TypeToken<Province>(){}.getType();
            List<Province> provinceList = gson.fromJson(respone, provinceListType);
            for (Province province : provinceList) {
                province.save();
            }
            return true;
        }
        return false;
    }

    public static boolean handleCityResponse(String respone, int provinceId) {
        if (!TextUtils.isEmpty(respone)) {
            Gson gson = new Gson();
            Type cityListType = new TypeToken<City>(){}.getType();
            List<City> cityList = gson.fromJson(respone, cityListType);
            for (City city : cityList) {
                city.setProvinceId(provinceId);
                city.save();
            }
            return true;
        }
        return false;
    }

    public static boolean handleCountyResponse(String respone, int cityId) {
        if (!TextUtils.isEmpty(respone)) {
            Gson gson = new Gson();
            Type countyListType = new TypeToken<County>(){}.getType();
            List<County> countyList = gson.fromJson(respone, countyListType);
            for (County county : countyList) {
                county.setCityId(cityId);
                county.save();
            }
            return true;
        }
        return false;
    }


}
