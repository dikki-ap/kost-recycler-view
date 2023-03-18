package com.example.kostrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

        list.addAll(getListKost())
        showRecyclerList()
    }

    private fun getListKost(): ArrayList<Kost> {
        val dataName = resources.getStringArray(R.array.data_name)
        val dataPrice = resources.getStringArray(R.array.data_price)
        val dataPlace = resources.getStringArray(R.array.data_place)
        val dataDescription = resources.getStringArray(R.array.data_description)
        val dataPhoto = resources.obtainTypedArray(R.array.data_photo)
        val listHero = ArrayList<Kost>()
        for (i in dataName.indices) {
            val kost = Kost(dataName[i], dataPrice[i], dataPlace[i], dataDescription[i],  dataPhoto.getResourceId(i, -1))
            listHero.add(kost)
        }
        return listHero
    }

    private fun showRecyclerList() {
        rvKost.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListKostAdapter(list)
        rvKost.adapter = listHeroAdapter
    }
}