package com.example.snapstudy_android

import android.support.v7.widget.RecyclerView
import com.example.snapstudy_android.databinding.CardCellBinding

class CardViewHolder(
    private val cardCellBinding: CardCellBinding
) :RecyclerView.ViewHolder(cardCellBinding.root){

    fun bindCard(card: Flashcard){
        cardCellBinding.tvAnswer.text = card.answer
        cardCellBinding.tvPrompt.text = card.prompt
    }
}