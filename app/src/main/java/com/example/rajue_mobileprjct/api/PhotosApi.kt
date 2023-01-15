package com.example.rajue_mobileprjct.api

import com.example.rajue_mobileprjct.model.Photo
import io.reactivex.Single
import retrofit2.http.GET

interface PhotosApi {
    @GET("data")
    fun getPhotos(): Single<List<Photo>>
}