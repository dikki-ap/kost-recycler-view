package com.example.kostrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KostRecycler : AppCompatActivity() {

    private lateinit var rvKost: RecyclerView
    private val list = ArrayList<Kost>()

    private fun initComponents(){
        rvKost = findViewById(R.id.rvKost)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kost_recycler)

        initComponents()
        rvKost.setHasFixedSize(true)

        list.addAll(KostData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvKost.layoutManager = LinearLayoutManager(this)
        val listKostAdapter = ListKostAdapter(list)
        rvKost.adapter = listKostAdapter
    }
}