package com.example.myapp77

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView

class Fragment_3 : Fragment() {

    private lateinit var cardView1 : CardView
    private lateinit var cardView2 : CardView
    private lateinit var cardView3 : CardView
    private lateinit var cardView4 : CardView
    private lateinit var cardView5 : CardView

    private var action2 : FragmentAction4? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        action2 = context as MainActivity
    }



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        cardView1 = view.findViewById(R.id.card3_1)
        cardView2 = view.findViewById(R.id.card3_2)
        cardView3 = view.findViewById(R.id.card3_3)
        cardView4 = view.findViewById(R.id.card3_4)
        cardView5 = view.findViewById(R.id.card3_5)


        cardView1.setOnClickListener {
            action2?.action25()
        }
        cardView2.setOnClickListener {
            action2?.action26()
        }
        cardView3.setOnClickListener {
            action2?.action27()
        }
        cardView4.setOnClickListener {
            action2?.action28()
        }
        cardView5.setOnClickListener {
            action2?.action29()
        }


    }
}

interface FragmentAction4 {
    fun action25()
    fun action26()
    fun action27()
    fun action28()
    fun action29()

}