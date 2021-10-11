package com.example.myapp77

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment

class Fragment_1: Fragment() {

    private lateinit var cardView1 : CardView
    private lateinit var cardView2 : CardView
    private lateinit var cardView3 : CardView
    private lateinit var cardView4 : CardView
    private lateinit var cardView5 : CardView
    private lateinit var cardView6 : CardView
    private lateinit var cardView7 : CardView
    private lateinit var cardView8 : CardView
    var item : Int? = null


    private var action1 : FragmentAction2? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        action1 = context as MainActivity
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        item = requireArguments().getInt("item")


        return inflater.inflate(R.layout.fragment_1, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        cardView1 = view.findViewById(R.id.card1_1)
        cardView2 = view.findViewById(R.id.card1_2)
        cardView3 = view.findViewById(R.id.card1_3)
        cardView4 = view.findViewById(R.id.card1_4)
        cardView5 = view.findViewById(R.id.card1_5)
        cardView6 = view.findViewById(R.id.card1_6)
        cardView7 = view.findViewById(R.id.card1_7)
        cardView8 = view.findViewById(R.id.card1_8)

        cardView1.setOnClickListener {
            action1?.action9(0)
        }

        cardView2.setOnClickListener {
            action1?.action10(1)
        }
        cardView3.setOnClickListener {
            action1?.action11(2)
        }
        cardView4.setOnClickListener {
            action1?.action12()
        }
        cardView5.setOnClickListener {
            action1?.action13()
        }
        cardView6.setOnClickListener {
            action1?.action14()
        }
        cardView7.setOnClickListener {
            action1?.action15()
        }
        cardView8.setOnClickListener {
            action1?.action16()
        }
    }



}
interface FragmentAction2 {
    fun action9(item : Int)
    fun action10(item : Int)
    fun action11(item : Int)
    fun action12()
    fun action13()
    fun action14()
    fun action15()
    fun action16()
}