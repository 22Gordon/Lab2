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
        val size = if(currentPlace.habitants < 5000) "pequeno" else "grande"
        val nation = if(position % 2 == 0) "English" else "Chinese"

        holder._country.text = currentPlace.country + " - (" + currentPlace.capital + ")"
        holder._habitantes.text = size
        holder._presidentes.text = currentPlace.president +" - (" + nation + ")"
    }

}

class LineViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    val _capital: TextView
    val _country: TextView
    val _habitantes: TextView
    val _presidentes: TextView
    val _nacionality: TextView

    init {
        _capital = itemView.findViewById(R.id.txtcapital)
        _country = itemView.findViewById(R.id.txtcountry)
        _habitantes = itemView.findViewById(R.id.txthabitants)
        _presidentes = itemView.findViewById(R.id.txtpresident)
        _nacionality = itemView.findViewById(R.id.txtnacionality)
    }

}