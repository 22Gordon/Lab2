package com.example.recycle.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycle.R
import com.example.recycle.dataclasses.Place

class LineAdapter(val list: ArrayList<Place>): RecyclerView.Adapter<LineViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LineViewHolder {

        val itemView = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.recyclerline, parent, false);
        return LineViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: LineViewHolder, position: Int) {
        val currentPlace = list[position]

        holder._capital.text = currentPlace.capital + " - (" + currentPlace.country + ")"
        holder._country.text = currentPlace.country
        holder._habitantes.text = currentPlace.habitants.toString()
    }

}

class LineViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    val _capital: TextView
    val _country: TextView
    val _habitantes: TextView

    init {
        _capital = itemView.findViewById(R.id.txtcapital)
        _country = itemView.findViewById(R.id.txtcountry)
        _habitantes = itemView.findViewById(R.id.txthabitants)
    }

}