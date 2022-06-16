package com.example.snapstudy_android.fragments

import android.os.Bundle
import android.view.*
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.example.snapstudy_android.R
import kotlinx.android.synthetic.main.fragment_study.*


class StudyFragment : Fragment() {

    private var isHid: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val studyView = inflater.inflate(R.layout.fragment_study,container,false)
        var cardF:CardView = studyView.findViewById(R.id.cvAnswer)


        cardF.setOnClickListener{
            if(isHid){
                tvFlashPrompt.alpha = 1.0f
                isHid = false
            }

            else {
                tvFlashPrompt.alpha = 0.0f
                isHid = true
            }
        }


        return studyView
    }
}
