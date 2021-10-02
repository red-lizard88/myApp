package com.example.myapp

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment

class Fragment_2: Fragment() {

    private lateinit var cardView1 : CardView
    private lateinit var cardView2 : CardView
    private lateinit var cardView3 : CardView
    private lateinit var cardView4 : CardView
    private lateinit var cardView5 : CardView
    private lateinit var cardView6 : CardView
    private lateinit var cardView7 : CardView
    private lateinit var cardView8 : CardView

    private var action1 : FragmentAction3? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        action1 = context as MainActivity
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_2, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        cardView1 = view.findViewById(R.id.card2_1)
        cardView2 = view.findViewById(R.id.card2_2)
        cardView3 = view.findViewById(R.id.card2_3)
        cardView4 = view.findViewById(R.id.card2_4)
        cardView5 = view.findViewById(R.id.card2_5)
        cardView6 = view.findViewById(R.id.card2_6)
        cardView7 = view.findViewById(R.id.card2_7)
        cardView8 = view.findViewById(R.id.card2_8)

        cardView1.setOnClickListener {
            action1?.action17()
        }
        cardView2.setOnClickListener {
            action1?.action18()
        }
        cardView3.setOnClickListener {
            action1?.action19()
        }
        cardView4.setOnClickListener {
            action1?.action20()
        }
        cardView5.setOnClickListener {
            action1?.action21()
        }
        cardView6.setOnClickListener {
            action1?.action22()
        }
        cardView7.setOnClickListener {
            action1?.action23()
        }
        cardView8.setOnClickListener {
            action1?.action24()
        }
    }


}
interface FragmentAction3 {
    fun action17()
    fun action18()
    fun action19()
    fun action20()
    fun action21()
    fun action22()
    fun action23()
    fun action24()
}