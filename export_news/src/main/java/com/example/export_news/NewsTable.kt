package com.example.export_news

import com.alibaba.android.arouter.launcher.ARouter

fun getNewsService(): INewsService =
    ARouter.getInstance().build("/export/news/service").navigation() as INewsService

fun getNewsList(): List<String> = getNewsService().getNewsList()
