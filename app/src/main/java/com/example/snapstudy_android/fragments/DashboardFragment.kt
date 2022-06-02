package com.example.snapstudy_android.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.snapstudy_android.*
import com.example.snapstudy_android.databinding.FragmentDashboardBinding
import kotlinx.android.synthetic.main.fragment_dashboard.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DashboardFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!
    private lateinit var listAdapter: ListAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_dashboard,container,false)

        populateList()
        initRecyclerView(view)
        return view
    }


    private fun initRecyclerView(view:View){
        val recyclerView = view.findViewById<RecyclerView>(R.id.rvList)

        recyclerView.layoutManager = LinearLayoutManager(activity)
        listAdapter = ListAdapter(wordList)
        recyclerView.adapter = listAdapter
    }

    private fun populateList(){
        val word1 = Word(prompt = "Hello", answer = "こんにちは")
        val word2 = Word(prompt = "Thank you", answer = "ありがとうございました")
        val word3 = Word(prompt = "Sorry", answer = "ごめん")
        val word4 = Word(prompt = "Goodbye", answer = "さようなら")
        val word5 = Word(prompt = "Hungry", answer = "お腹がすいた")

        wordList.add(word1)
        wordList.add(word2)
        wordList.add(word3)
        wordList.add(word4)
        wordList.add(word5)

    }


}