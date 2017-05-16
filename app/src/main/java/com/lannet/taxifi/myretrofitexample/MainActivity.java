package com.lannet.taxifi.myretrofitexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.lannet.taxifi.myretrofitexample.Retrofit.TmdbApi;
import com.lannet.taxifi.myretrofitexample.model.Location;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
 private static final String TAG="MainActivity";
    private static final String API_KEY="73e6499e-4965-43ea-b362-50b6aa25ac91";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fetchWeatherSites();
    }
    private void fetchWeatherSites(){
        TmdbApi.getInstance().findMovies(API_KEY).enqueue(new Callback<List<Location>>() {
            @Override
            public void onResponse(Call<List<Location>> call, Response<List<Location>> response) {
                // always check this or you might get null pointers
                if (response.isSuccessful()) {
                    List<Location> movies = response.body();
                    for (Location movie : movies) {
                        Log.d(TAG, "onResponse: "+ movie.getName());
                    }

                } else {
                    Log.d(TAG, "onResponse: unsuccessful "+ response.message());
                }
            }

            @Override
            public void onFailure(Call<List<Location>> call, Throwable t) {
                Log.e(TAG, "onFailure: ", t );
            }
        });

    }
}
