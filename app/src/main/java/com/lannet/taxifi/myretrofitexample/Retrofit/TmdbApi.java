package com.lannet.taxifi.myretrofitexample.Retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TmdbApi {
    public static final String BASE_URL = "http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/";

    private static TmdbService instance;

    public static TmdbService getInstance() {
        if (instance == null) {
            instance = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(getGsonConverter())
                    .build()
                    .create(TmdbService.class);
        }

        return instance;
    }

    private static GsonConverterFactory getGsonConverter() {
        Gson gson = new GsonBuilder().registerTypeAdapter(List.class, new TypeAdapter()).create();
        return GsonConverterFactory.create(gson);
    }
}
