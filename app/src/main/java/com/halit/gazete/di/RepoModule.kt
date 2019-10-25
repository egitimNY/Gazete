package com.halit.gazete.di

import android.app.Application
import com.halit.gazete.db.repo.DatabaseRepository
import com.halit.gazete.network.NewsRepository
import com.halit.gazete.network.api.RetrofitApiService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepoModule
{
    @Singleton
    @Provides
    fun provideNewsRepository(retrofitApiService: RetrofitApiService)= NewsRepository(retrofitApiService)

    @Singleton
    @Provides
    fun provideDatabaseRepository(application: Application)= DatabaseRepository(application)
}