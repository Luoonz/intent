package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_linear.*

class LinearActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear)

        if(intent.hasExtra("data")){
            getTv.text = intent.getStringExtra("data")
        }else{
            Toast.makeText(this@LinearActivity, "no data", Toast.LENGTH_SHORT).show()
        }
    }
}