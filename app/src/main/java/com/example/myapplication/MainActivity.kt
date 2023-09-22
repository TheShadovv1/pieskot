package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.przyciskpies).setOnClickListener {
            findViewById<ImageView>(R.id.pies).setImageResource(
                R.drawable.pies
            )
        }
            findViewById<Button>(R.id.przyciskkot).setOnClickListener {
                findViewById<ImageView>(R.id.pies).setImageResource(
                    R.drawable.kot
                )
        }

    }
}

