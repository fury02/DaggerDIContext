package com.simple.example.dagger.di.inject.context

import android.content.Context
import javax.inject.Inject

class a @Inject constructor(app: Context, b:b){
    private var context = app
    private var b = b

    fun testFunA()
    {
        b.testFunB(context)
    }
}