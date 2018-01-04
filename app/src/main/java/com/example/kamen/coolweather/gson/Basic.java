package com.example.kamen.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Kamen on 2018/1/4.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
