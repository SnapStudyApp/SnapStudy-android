package com.example.snapstudy_android.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.snapstudy_android.ListHolder
import com.example.snapstudy_android.Word
import com.example.snapstudy_android.databinding.ListCellBinding

class ListAdapter (private val words: List<Word>): RecyclerView.Adapter<ListHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListCellBinding.inflate(inflater,parent,false)
        return ListHolder(binding)
    }

    override fun onBindViewHolder(holder: ListHolder, position: Int) {
        holder.bindWord(words[position])
    }

    override fun getItemCount(): Int {
        return words.size
    }

}