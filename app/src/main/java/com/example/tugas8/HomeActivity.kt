package com.example.tugas8

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.content.Intent

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

    }
    fun favorite (view: View) {
        Intent(this, favorite::class.java).also {
            startActivity(it)
            finish()
        }
    }
    fun toflashsale (view: View) {
        Intent(this, flashsale::class.java).also {
            startActivity(it)
            finish()
        }
    }
    fun barang (view: View) {
        Intent(this, barang::class.java).also {
            startActivity(it)
            finish()
        }
    }
}