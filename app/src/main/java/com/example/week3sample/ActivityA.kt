package com.example.week3sample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.week3sample.databinding.ActivityABinding

class ActivityA : AppCompatActivity() {

    private lateinit var ui : ActivityABinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui = ActivityABinding.inflate(layoutInflater)
        setContentView(ui.root)

        ui.btnOpenB.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            startActivity(intent)
        }
        ui.btnOpenC.setOnClickListener {
            val intent = Intent(this, ActivityC::class.java)
            startActivity(intent)
        }
    }
}