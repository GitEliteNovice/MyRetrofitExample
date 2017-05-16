package com.lannet.taxifi.myretrofitexample.Retrofit;

import com.lannet.taxifi.myretrofitexample.model.Location;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface TmdbService {
    @GET("sitelist?")
    public Call<List<Location>> findMovies(@Query("key") String apiKey);
}
