package com.example.export_mine

import androidx.fragment.app.Fragment
import com.alibaba.android.arouter.facade.template.IProvider

interface IMineService : IProvider {

    fun getMineFragment(): Fragment
}

