package com.example.kamen.coolweather.gson;

/**
 * Created by Kamen on 2018/1/4.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;

        public String pm25;
    }
}
