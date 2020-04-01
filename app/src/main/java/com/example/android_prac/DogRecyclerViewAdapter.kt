package com.example.android_prac

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DogRecyclerViewAdapter(val ctx: Context, val dataList: ArrayList<DogData>) :
    RecyclerView.Adapter<DogRecyclerViewAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view : View = LayoutInflater.from(ctx).inflate(R.layout.rv_item_repository,parent,false)
        return Holder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        //뷰 바인딩
        holder.kind.text = dataList[position].kind
        holder.age.text = dataList[position].age.toString()
        holder.character.text = dataList[position].character
        holder.place.text = dataList[position].place
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val kind: TextView = itemView.findViewById(R.id.rv_txt_kind) as TextView
        val age: TextView = itemView.findViewById(R.id.rv_txt_age) as TextView
        val character: TextView = itemView.findViewById(R.id.rv_txt_charac) as TextView
        val place: TextView = itemView.findViewById(R.id.rv_txt_place) as TextView
    }

}