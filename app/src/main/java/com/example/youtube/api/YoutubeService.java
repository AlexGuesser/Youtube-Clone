package com.example.youtube.api;

import com.example.youtube.model.Resultado;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface YoutubeService {

    /*
    https://www.googleapis.com/youtube/v3/
    search
    ?part=snippet
    &order=date
    &maxResults=20
    &key=AIzaSyCTl7cCJSLhF6lD4CsNLkr74OnYzGXfD4s
    &channelId=UCVHFbqXqoYvEWM1Ddxl0QDg

    https://www.googleapis.com/youtube/v3/search?part=snippet&order=date&maxResults=20&key=AIzaSyCTl7cCJSLhF6lD4CsNLkr74OnYzGXfD4s&channelId=UCVHFbqXqoYvEWM1Ddxl0QDg
     */

    @GET("search")
    Call<Resultado> recuperarVideos(
            @Query("part") String part,
            @Query("order") String order,
            @Query("maxResults") String maxResults,
            @Query("key") String key,
            @Query("channelId") String channelId,
            @Query("q") String q);

}
