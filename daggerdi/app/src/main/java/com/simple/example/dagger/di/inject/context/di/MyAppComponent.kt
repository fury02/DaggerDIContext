package com.simple.example.dagger.di.inject.context.di

import com.simple.example.dagger.di.inject.context.a
import com.simple.example.dagger.di.inject.context.di.module.MyAppModule
import dagger.Component

@Component(modules = [MyAppModule::class])
interface MyAppComponent {
    fun get_a() : a
}