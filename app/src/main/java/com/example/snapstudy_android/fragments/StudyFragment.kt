package com.example.snapstudy_android.fragments

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.os.Bundle
import android.view.*
import androidx.core.view.GestureDetectorCompat
import androidx.fragment.app.Fragment
import com.example.snapstudy_android.R
import kotlinx.android.synthetic.main.fragment_study.*


class StudyFragment : Fragment() {

    lateinit var frontAnim: AnimatorSet
    lateinit var backAnim: AnimatorSet
    private lateinit var detector: GestureDetectorCompat
    var isFront = true


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setting scale
        var scale:Float= resources.displayMetrics.density
        cvAnswer.cameraDistance = 8000*scale
        cvPrompt.cameraDistance=8000*scale

        //front animation
        frontAnim=AnimatorInflater.loadAnimator(activity,R.animator.front_animator) as AnimatorSet
        backAnim=AnimatorInflater.loadAnimator(activity,R.animator.back_animator) as AnimatorSet

        //setting the swipe detector
        detector = GestureDetectorCompat(activity,CardGestureListener())

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val studyView = inflater.inflate(R.layout.fragment_study,container,false)


        return view
    }

//    override fun onTouchEvent(event:MotionEvent?):Boolean{
//        if (detector.onTouchEvent())
//    }

    inner class CardGestureListener: GestureDetector.SimpleOnGestureListener(){
        private val SWIPE_THRESHOLD = 100
        private val SWIPE_VELOCITY_THRESHOLD = 100
        override fun onFling(
            downEvent: MotionEvent?,
            moveEvent: MotionEvent?,
            velocityX: Float,
            velocityY: Float
        ): Boolean {
            var diffX=moveEvent?.x?.minus(downEvent!!.x) ?:0.0F
            var diffY=moveEvent?.y?.minus(downEvent!!.y) ?:0.0F

            if(Math.abs(diffX)>Math.abs(diffY)){
                //this is a left or right swipe
                if(Math.abs(diffX)>SWIPE_THRESHOLD && Math.abs(velocityX)>SWIPE_VELOCITY_THRESHOLD){
                    if(diffX>0){
                        //right swipe
                        this@StudyFragment.onRightSwipe()
                    }

                    else{
                        //left swipe
                        this@StudyFragment.onLeftSwipe()
                    }
                }
            }

            return super.onFling(downEvent, moveEvent, velocityX, velocityY)
        }
    }

    private fun onLeftSwipe() {
        TODO("Not yet implemented")
    }

    private fun onRightSwipe() {
        TODO("Not yet implemented")
    }

}