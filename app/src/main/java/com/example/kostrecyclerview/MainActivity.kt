package com.example.kostrecyclerview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var about_page : Button
    private lateinit var rvButton : Button

    private fun initComponents(){
        about_page = findViewById(R.id.about_page)
        rvButton = findViewById(R.id.rvButton)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initComponents()

        about_page.setOnClickListener {
            val moveIntent = Intent(this@MainActivity, About::class.java)
            startActivity(moveIntent)
        }

        rvButton.setOnClickListener {
            val moveIntent = Intent(this@MainActivity, KostRecycler::class.java)
            startActivity(moveIntent)
        }

    }
}