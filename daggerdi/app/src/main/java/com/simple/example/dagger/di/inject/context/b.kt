package com.simple.example.dagger.di.inject.context

import android.content.Context
import javax.inject.Inject

class b @Inject constructor(){
    fun testFunB(app:Context)
    {
        var str = "Hello dagger DI"
    }
}