package com.example.dell.mapsusingretrofit.Retrointerface;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by Dell on 17-02-2018.
 */

public class RetrofitApi {
    String url = "https://maps.googleapis.com/maps/";

    public Retrofit retrofit;
    public Retrofit getRetrofit(){
        retrofit=new Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;

    }
}
