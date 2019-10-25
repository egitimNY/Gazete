package com.halit.gazete.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.halit.gazete.db.dao.NewsDao
import com.halit.gazete.db.entity.ArticleTable

@Database(entities = arrayOf(ArticleTable::class), version = 1)
abstract class AppDatabase:RoomDatabase() {

    companion object{
        private var appDatabase:AppDatabase?=null

        fun getInstance(context:Context):AppDatabase?{
            if(appDatabase==null)
                appDatabase = Room.databaseBuilder(context,AppDatabase::class.java, "NewsRoomDB").build()

            return appDatabase
        }
    }

    abstract fun getNewsDao():NewsDao
}