package com.halit.gazete.di

import com.halit.gazete.myapp.NewsApplication
import dagger.Module
import dagger.Provides

@Module
class UtilModule
{
    @Provides
    fun provideApplicationInstance() = NewsApplication.getApplicationInstance()
}