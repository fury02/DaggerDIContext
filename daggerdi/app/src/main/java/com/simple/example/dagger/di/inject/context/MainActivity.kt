package com.simple.example.dagger.di.inject.context

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.simple.example.dagger.di.inject.context.di.DaggerMyAppComponent
import com.simple.example.dagger.di.inject.context.di.MyAppComponent
import com.simple.example.dagger.di.inject.context.di.module.MyAppModule

class MainActivity : AppCompatActivity() {

    lateinit var daggerMyAppComponent: MyAppComponent
    lateinit var a: a

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //context
        var app = this
        //dager build or create
        daggerMyAppComponent = DaggerMyAppComponent.builder().myAppModule(MyAppModule(this)).build()
        a = daggerMyAppComponent.get_a()

        var button = findViewById<Button>(R.id.testdi)

        button.setOnClickListener { onButtonClick()  }
    }

    private fun onButtonClick() {
        a.testFunA()
    }
}