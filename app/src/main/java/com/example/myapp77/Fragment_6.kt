package com.example.myapp77

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView

class Fragment_6 : Fragment() {

    private lateinit var cardView1 : CardView
    private lateinit var cardView2 : CardView
    private lateinit var cardView3 : CardView
    private lateinit var cardView4 : CardView

    private var action2 : FragmentAction7? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        action2 = context as MainActivity
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_6, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        cardView1 = view.findViewById(R.id.card6_1)
        cardView2 = view.findViewById(R.id.card6_2)
        cardView3 = view.findViewById(R.id.card6_3)
        cardView4 = view.findViewById(R.id.card6_4)


        cardView1.setOnClickListener {
            action2?.action39()
        }
        cardView2.setOnClickListener {
            action2?.action40()
        }
        cardView3.setOnClickListener {
            action2?.action41()
        }
        cardView4.setOnClickListener {
            action2?.action42()
        }


    }

}

interface FragmentAction7 {
    fun action39()
    fun action40()
    fun action41()
    fun action42()


}