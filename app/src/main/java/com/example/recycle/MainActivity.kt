package com.example.recycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycle.adapter.LineAdapter
import com.example.recycle.dataclasses.Place

class MainActivity : AppCompatActivity() {
    private lateinit var myList: ArrayList<Place>
    private lateinit var recycler_view: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myList = ArrayList<Place>()

        for (i in 0 until 500) {
            val population = i * 500
            val size = if (population < 500) "pequeno" else "grande"
            myList.add(Place("Country $i", size, "Capital $i", "President $i"))
        }

        recycler_view = findViewById<RecyclerView>(R.id.recView)
        recycler_view.adapter = LineAdapter(myList)
        recycler_view.layoutManager = LinearLayoutManager(this)
    }
}