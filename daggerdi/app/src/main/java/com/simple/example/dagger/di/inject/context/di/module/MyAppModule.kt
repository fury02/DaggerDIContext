package com.simple.example.dagger.di.inject.context.di.module

import android.content.Context
import com.simple.example.dagger.di.inject.context.a
import com.simple.example.dagger.di.inject.context.b
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MyAppModule(app: Context)  {
    private var context = app

    @Provides
    fun provideA() : a {
        return  a(context, provideB())
    }

    @Singleton
    @Provides
    fun provideB() : b = b()
}