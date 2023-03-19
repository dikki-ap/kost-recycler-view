package com.example.kostrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

@Suppress("DEPRECATION")
class KostDetail : AppCompatActivity() {

    companion object {
        const val KEY_KOST = "key_kost"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kost_detail)

        supportActionBar!!.title = "Kost Detail"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val dataKost = intent.getParcelableExtra(KEY_KOST) as Kost?

        if (dataKost != null) {
            findViewById<ImageView>(R.id.img_item_picture).setImageResource(dataKost.photo)
        }

        findViewById<TextView>(R.id.tv_kost_name).text = dataKost?.name
        findViewById<TextView>(R.id.tv_kost_place).text = dataKost?.place
        findViewById<TextView>(R.id.tv_kost_price).text = dataKost?.price
        findViewById<TextView>(R.id.tv_kost_description).text = dataKost?.description
        findViewById<Button>(R.id.btn_share).setOnClickListener {
            Toast.makeText(this, "You Share " + dataKost?.name, Toast.LENGTH_SHORT).show()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()

        return true
    }
}