package com.halit.gazete.viewmodel

import android.app.Application
import com.halit.gazete.base.BaseViewModel
import com.halit.gazete.db.entity.ArticleTable
import com.halit.gazete.db.repo.DatabaseRepository
import com.halit.gazete.model.News
import javax.inject.Inject

class NewsDetailsViewModel  @Inject constructor(application: Application,val databaseRepository: DatabaseRepository):BaseViewModel(application)
{
    fun bookMarkArticle(article: News.Article){
        val tableArticle: ArticleTable = ArticleTable(article.source?.name,article.author,article.title,article.description,article.url,article.urlToImage,article.publishedAt,article.content)
        databaseRepository.insertArticle(tableArticle)
    }

    fun bookMarkArticle(article:ArticleTable){
        databaseRepository.insertArticle(article)
    }

    fun deleteBookMarkArticle(article: News.Article){
        //val tableArticle: ArticleTable = ArticleTable(article.source?.name,article.author,article.title,article.description,article.url,article.urlToImage,article.publishedAt,article.content)
        databaseRepository.deleteBookMarkByTitle(article.title?:"")
    }

    fun deleteBookMarkArticle(article: ArticleTable){
        databaseRepository.deleteBookMark(article)
    }
}