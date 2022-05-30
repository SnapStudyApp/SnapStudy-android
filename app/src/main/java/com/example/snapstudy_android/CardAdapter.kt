package com.example.snapstudy_android

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.snapstudy_android.databinding.CardCellBinding

class CardAdapter(private val cards: List<Flashcard>) :RecyclerView.Adapter<CardViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = CardCellBinding.inflate(from, parent, false)
        return CardViewHolder(binding)


    }

    override fun onBindViewHolder(holder: CardViewHolder,position: Int) {
        holder.bindCard(cards[position])
    }

    override fun getItemCount(): Int {
        return cards.size
    }
}