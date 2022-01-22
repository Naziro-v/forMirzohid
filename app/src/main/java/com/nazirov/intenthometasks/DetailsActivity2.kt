package com.nazirov.intenthometasks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class DetailsActivity2 : AppCompatActivity() {
    val TAG = DetailsActivity2::class.java.toString()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details2)
        initViews()
    }

    private fun initViews() {
        var task2 = findViewById<TextView>(R.id.tv_details2)

        var user = intent.getSerializableExtra("user")
        Log.d(TAG,user.toString())

        task2.text=user.toString()
    }
}