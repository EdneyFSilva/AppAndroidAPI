package com.kotlinbootcamp.appapi.api

import com.kotlinbootcamp.appapi.model.Product
import retrofit2.Call
import retrofit2.http.GET

interface ProductAPI {
    @GET("getdata.php")
    fun getProductApi(): Call<List<Product>>
}