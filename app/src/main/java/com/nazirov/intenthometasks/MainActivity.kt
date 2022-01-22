package com.nazirov.intenthometasks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        var task1 = findViewById<Button>(R.id.btn_task1)
        task1.setOnClickListener {
            openDetails1()

        }


            var task2 = findViewById<Button>(R.id.btn_task2)
            task2.setOnClickListener {
                var user = User(id = 111, name = "Elmurod bro")
                openDetails2(user)
            }

        var task3 = findViewById<Button>(R.id.btn_task3)
        task3.setOnClickListener {
            var user = User(id = 1001, name = "Elmurod bro")
            openDetails3(user)

        }

        var task4 = findViewById<Button>(R.id.btn_task4)
        task4.setOnClickListener {

        }
    }

    private fun openDetails3(user: User) {

        var intent = Intent(this, DetailsActivity2::class.java)
        intent.putExtra("user", user)
        startActivity(intent)

    }

    private fun openDetails2(user: User) {
        var intent = Intent(this, DetailsActivity2::class.java)
        intent.putExtra("user", user)
        startActivity(intent)

    }

    private fun openDetails1() {
        var intent = Intent(this, DetailsActivity1::class.java)
        intent.putExtra("name", "Elmurod bro")
        startActivity(intent)
    }

}