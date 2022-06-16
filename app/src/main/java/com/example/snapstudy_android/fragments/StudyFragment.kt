package com.example.snapstudy_android.fragments

import android.os.Bundle
import android.view.*
import android.view.GestureDetector.SimpleOnGestureListener
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.core.view.GestureDetectorCompat
import androidx.fragment.app.Fragment
import com.example.snapstudy_android.R
import kotlinx.android.synthetic.main.fragment_study.*



class StudyFragment : Fragment() {

    private var isHid: Boolean = true
    //private lateinit var detector: GestureDetectorCompat

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //detector = GestureDetectorCompat(activity,FlashGestureListener())
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
            }

        }

        val gesture = GestureDetector(
            activity,
            object : SimpleOnGestureListener() {
                override fun onFling(
                    downEvent: MotionEvent, moveEvent: MotionEvent, velocityX: Float,
                    velocityY: Float
                ): Boolean {
                    val SWIPE_MIN_DISTANCE = 100
                    val SWIPE_MAX_OFF_PATH = 100
                    val SWIPE_THRESHOLD_VELOCITY = 100
                    var diffX = moveEvent?.x?.minus(downEvent!!.x) ?: 0.0F
                    var diffY = moveEvent?.y?.minus(downEvent!!.y) ?: 0.0F
                    try {
                        if (Math.abs(diffX) > Math.abs(diffY)) {
                            //left or tight swipe
                            if(Math.abs(diffX) > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY){
                                if(diffX>0){
                                //RIGHT SWIPE
                                    Toast.makeText(activity,"Right Swipe", Toast.LENGTH_LONG).show()
                                }

                                else{
                                    //LEFT SWIPE
                                    Toast.makeText(activity,"Left Swipe", Toast.LENGTH_LONG).show()
                                }

                            }}
//                        if (Math.abs(e1.y - e2.y) > SWIPE_MAX_OFF_PATH) return false
//                        if (e1.x - e2.x > SWIPE_MIN_DISTANCE
//                            && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY
//                        ) {
//                            Toast.makeText(activity,"Right Swipe", Toast.LENGTH_LONG).show()
//                        } else if (e2.x - e1.x > SWIPE_MIN_DISTANCE
//                            && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY
//                        ) {
//                            Toast.makeText(activity,"Left Swipe", Toast.LENGTH_LONG).show()
//                        }
                    } catch (e: Exception) {
                        // nothing
                    }
                    return super.onFling(downEvent, moveEvent, velocityX, velocityY)
                }
            })

        studyView.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View?, event: MotionEvent?): Boolean {
                gesture.onTouchEvent(event)

                return true
            }
        })


        return studyView
    }

//    inner class FlashGestureListener : GestureDetector.SimpleOnGestureListener(){
//
//        private val SWIPE_THRESHOLD = 100
//        private val SWIPE_VELOCITY_THRESHOLD = 100

//        override fun onFling(
//            downEvent: MotionEvent?,
//            moveEvent: MotionEvent?,
//            velocityX: Float,
//            velocityY: Float
//        ): Boolean {
//            //measuring swipe distance
//            var diffX = moveEvent?.x?.minus(downEvent!!.x) ?: 0.0F
//            var diffY = moveEvent?.y?.minus(downEvent!!.y) ?: 0.0F
//
//            if (Math.abs(diffX) > Math.abs(diffY)) {
//                //left or tight swipe
//                if(Math.abs(diffX) > SWIPE_THRESHOLD && Math.abs(velocityX) > 100){
//                    if(diffX>0){
//                    //RIGHT SWIPE
//                        this@StudyFragment.onSwipeRight()
//                    }
//
//                    else{
//                        //LEFT SWIPE
//                        this@StudyFragment.onSwipeLeft()
//                    }
//
//                }
//
//            }
//
//            return super.onFling(downEvent, moveEvent, velocityX, velocityY)
//        }
    }

//    private fun onSwipeLeft() {
//        TODO("Not yet implemented")
//    }
//
//    private fun onSwipeRight() {
//        TODO("Not yet implemented")
//    }
//}
