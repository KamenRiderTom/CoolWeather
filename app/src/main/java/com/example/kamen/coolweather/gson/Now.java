package com.example.kamen.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Kamen on 2018/1/4.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
