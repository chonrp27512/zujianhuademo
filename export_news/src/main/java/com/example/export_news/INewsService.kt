package com.example.export_news

import androidx.fragment.app.Fragment
import com.alibaba.android.arouter.facade.template.IProvider

interface INewsService : IProvider {

    fun getNewsList(): List<String>

}