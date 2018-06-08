package com.jhj.annotationdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CodeDealUtil().register(this)
    }

    @CodeDeal(key = "key", value = "value")
    fun test() {
        
    }
}
