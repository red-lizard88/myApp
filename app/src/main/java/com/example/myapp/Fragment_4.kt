package com.example.myapp

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView


class Fragment_4 : Fragment() {

    private lateinit var cardView1: CardView
    private lateinit var cardView2: CardView
    private lateinit var cardView3: CardView
    private lateinit var cardView4: CardView


    private var action2: FragmentAction5? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        action2 = context as MainActivity
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_4, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        cardView1 = view.findViewById(R.id.card4_1)
        cardView2 = view.findViewById(R.id.card4_2)
        cardView3 = view.findViewById(R.id.card4_3)
        cardView4 = view.findViewById(R.id.card4_4)



        cardView1.setOnClickListener {
            action2?.action30()
        }
        cardView2.setOnClickListener {
            action2?.action31()
        }
        cardView3.setOnClickListener {
            action2?.action32()
        }
        cardView4.setOnClickListener {
            action2?.action33()
        }

    }

}

    interface FragmentAction5 {
        fun action30()
        fun action31()
        fun action32()
        fun action33()


    }





