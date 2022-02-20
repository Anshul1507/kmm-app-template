package com.github.anshul1507.kmm_network_request.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.anshul1507.kmm_network_request.Greeting
import android.widget.TextView

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()
    }
}
