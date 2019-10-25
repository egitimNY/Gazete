package com.halit.gazete.myapp

import android.app.Application
import com.halit.gazete.di.*

class NewsApplication: Application()
{
    lateinit var appComponent: AppComponent

    companion object {

        lateinit var application: Application
        public fun getApplicationInstance(): Application {
            return application
        }
    }


    override fun onCreate() {
        super.onCreate()
        application = this@NewsApplication
        this.appComponent = this.initDagger()
    }

    protected fun initDagger():AppComponent = DaggerAppComponent.builder()
            .netModule(NetModule())
            .rxjavaModule(RxjavaModule())
            .repoModule(RepoModule())
            .build()
}