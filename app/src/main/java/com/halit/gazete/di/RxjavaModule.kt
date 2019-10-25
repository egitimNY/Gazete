package com.halit.gazete.di

import dagger.Module
import dagger.Provides
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Named

const val SUBCRIBER_ON = "SubscribeOn"
const val OBSERVER_ON = "ObserverOn"

@Module
class RxjavaModule
{
    @Provides
    @Named(SUBCRIBER_ON)
    fun provideSuscriberOn(): Scheduler = Schedulers.io()

    @Provides
    @Named(OBSERVER_ON)
    fun provideObserverOn(): Scheduler = AndroidSchedulers.mainThread()
}