package com.yuente.retrofitexample;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface JsonPlaceHolderApi {

    @GET("questions")
    Call<List<Question>> getPosts();
}
