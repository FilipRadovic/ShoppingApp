package com.example.shoppingapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    @GET("/api/v1/products.json?brand=maybelline")
    Call<List<Posts>> getPosts();

}
