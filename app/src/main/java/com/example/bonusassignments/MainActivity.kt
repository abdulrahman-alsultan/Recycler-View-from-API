package com.example.bonusassignments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun moveToSimpleGETRequest(view: View) {
        startActivity(Intent(this, SimpleGETRequest::class.java))
    }

    fun moveToRecyclerViewfromAPI(view: View) {
        startActivity(Intent(this, RecyclerViewfromAPI::class.java))
    }
}