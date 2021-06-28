package com.ame.peliculasticotv.common

import android.app.Application
import android.content.Context
import android.widget.Toast

class MyApp: Application() {

    companion object {
        lateinit var instance: MyApp
    }

    override fun onCreate() {
        super.onCreate()
        instance = this

        Helpers.toastShort("pollo", instance)



    }

}