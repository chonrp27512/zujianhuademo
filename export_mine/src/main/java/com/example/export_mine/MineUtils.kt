package com.example.export_mine

import androidx.fragment.app.Fragment
import com.alibaba.android.arouter.launcher.ARouter


fun getMineFragment(): Fragment =
    ARouter.getInstance().build("/mine/fragment").navigation() as Fragment