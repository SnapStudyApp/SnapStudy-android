package com.example.snapstudy_android

import androidx.recyclerview.widget.RecyclerView
import com.example.snapstudy_android.databinding.ListCellBinding

class ListHolder(private val listCellBinding: ListCellBinding) :RecyclerView.ViewHolder(listCellBinding.root){

    fun bindWord(word: Word){
        listCellBinding.tvListAnswer.text = word.answer
        listCellBinding.tvListPrompt.text = word.prompt
    }
}