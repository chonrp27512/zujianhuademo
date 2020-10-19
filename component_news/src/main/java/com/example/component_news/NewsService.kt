package com.example.component_news

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.export_news.INewsService

@Route(path = "/news/service")
class NewsService : INewsService {

    override fun getNewsList(): List<String> {
        var news = arrayListOf<String>()
        news.add("中国")
        news.add("妈妈")
        return news
    }

    override fun init(context: Context?) {

    }
}