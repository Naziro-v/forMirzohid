package com.nazirov.intenthometasks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class DetailsActivity1 : AppCompatActivity() {
    val TAG = DetailsActivity1::class.java.toString()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details1)
    initViews()
    }

    private fun initViews() {
         var tvDetails1 = findViewById<TextView>(R.id.tv_details1)

        var name = intent.getStringExtra("name")
        Log.d("name",name!!)

        tvDetails1.text=name
    }
}