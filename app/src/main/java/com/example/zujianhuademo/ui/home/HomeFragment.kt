package com.example.zujianhuademo.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.callback.NavigationCallback
import com.alibaba.android.arouter.launcher.ARouter
import com.example.zujianhuademo.R

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val skip_live: Button = root.findViewById(R.id.skip_live)
        skip_live.setOnClickListener {
            ARouter.getInstance().build("/live/home")
                .navigation(context, object : NavigationCallback {
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

        val skip_mine: Button = root.findViewById(R.id.skip_mine)
        skip_mine.setOnClickListener {
            ARouter.getInstance().build("/mine/home")
                .navigation(context, object : NavigationCallback {
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

        val skip_news: Button = root.findViewById(R.id.skip_news)
        skip_news.setOnClickListener {
            ARouter.getInstance().build("/news/home")
                .navigation(context, object : NavigationCallback {
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



        return root
    }
}