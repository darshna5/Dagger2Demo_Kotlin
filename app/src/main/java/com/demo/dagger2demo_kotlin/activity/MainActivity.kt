package com.demo.dagger2demo_kotlin.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.demo.dagger2demo_kotlin.R

class MainActivity:Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickRetro(view: View) {
        startActivity(Intent(this@MainActivity, RetroActivity::class.java))

    }
    fun onClickCoroutineParallelCall(view: View) {
        startActivity(Intent(this@MainActivity, CoroutinesParallelCallActivity::class.java))

    }
    fun onClickCoroutineSingleCall(view: View) {
        startActivity(Intent(this@MainActivity, CoroutinesSingleCallActivity::class.java))
    }
}