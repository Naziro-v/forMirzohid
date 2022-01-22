package com.nazirov.intenthometasks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class DetailsActivity3 : AppCompatActivity() {
    val TAG = DetailsActivity3::class.java.toString()

    val product = intent.getParcelableExtra<User2>("user")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details3)

        initViews()



    }

    private fun initViews() {
        var task3 = findViewById<TextView>(R.id.tv_details3)

        var user = intent.getParcelableExtra<User2>("user")
        Log.d(TAG,user.toString())

        task3.text=user.toString()
    }
}