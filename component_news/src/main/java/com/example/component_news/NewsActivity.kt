package com.example.component_news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.callback.NavigationCallback
import com.alibaba.android.arouter.launcher.ARouter
import com.example.export_mine.getMineFragment

@Route(path = "/component2/news")
class NewsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.news_activity)
        if (savedInstanceState == null) {

            //替换成其他组件的fragment
            val mineFragment = getMineFragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, mineFragment)
                .commitNow()
        }


        val skip_news: Button = findViewById(R.id.skip)
        skip_news.setOnClickListener {
            ARouter.getInstance().build("/component1/mine")
                .navigation(this, object : NavigationCallback {
                    override fun onFound(postcard: Postcard?) {
                        Log.d("xxx", "onFound：" + postcard.toString())
                    }

                    override fun onLost(postcard: Postcard?) {
                        Log.d("xxx", "onLost：" + postcard.toString())
                    }

                    override fun onArrival(postcard: Postcard?) {
                        Log.d("xxx", "onArrival：" + postcard.toString())
                    }

                    override fun onInterrupt(postcard: Postcard?) {
                        Log.d("xxx", "onInterrupt：" + postcard.toString())
                    }

                })
        }
    }
}