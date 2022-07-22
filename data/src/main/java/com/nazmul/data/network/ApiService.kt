package com.nazmul.data.network

import com.nazmul.common.Constant
import com.nazmul.data.network.model.BlogsDTO
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header

interface ApiService {

    @GET("post")
    suspend fun getBlogs(
        @Header("app-id") appId:String= Constant.APP_ID
    ) : Response<BlogsDTO>

}