package com.example.rajue_mobileprjct.api

import com.example.rajue_mobileprjct.model.Photo
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class PhotosService {
    private val BASE_URL = "https://retoolapi.dev/llw90i/"
    private val api: PhotosApi

    init {
        api = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(PhotosApi::class.java)
    }

    fun getPhotos(): Single<List<Photo>> {
        return api.getPhotos()
    }
}