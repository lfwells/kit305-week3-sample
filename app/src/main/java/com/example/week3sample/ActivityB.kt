package com.example.week3sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.week3sample.databinding.ActivityBBinding

class ActivityB : AppCompatActivity() {
    private lateinit var ui : ActivityBBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui = ActivityBBinding.inflate(layoutInflater)
        setContentView(ui.root)

        ui.btnFinish.setOnClickListener {
            finish()
        }
    }
}