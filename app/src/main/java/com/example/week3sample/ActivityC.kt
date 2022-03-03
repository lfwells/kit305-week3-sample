package com.example.week3sample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.week3sample.databinding.ActivityBBinding
import com.example.week3sample.databinding.ActivityCBinding

class ActivityC : AppCompatActivity() {
    private lateinit var ui : ActivityCBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui = ActivityCBinding.inflate(layoutInflater)
        setContentView(ui.root)

        ui.btnFinish.setOnClickListener {
            finish()
        }
        ui.btnOpenA.setOnClickListener {
            var intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }
    }
}