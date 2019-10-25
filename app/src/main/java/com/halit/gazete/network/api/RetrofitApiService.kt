package com.halit.gazete.network.api;

import com.halit.gazete.model.News
import com.halit.gazete.network.UrlConstant
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitApiService
{
    @GET("top-headlines")
    fun getTopHeadlineNews(@Query("country") country:String, @Query("apiKey") apiKey:String =UrlConstant.API_KEY): Observable<News>

    @GET("everything")
    fun getEverythingNews( @Query("q")query:String, @Query("apiKey") apiKey:String =UrlConstant.API_KEY): Observable<News>

}
