package com.example.myapp77

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView

class Fragment_5 : Fragment() {

    private lateinit var cardView1 : CardView
    private lateinit var cardView2 : CardView
    private lateinit var cardView3 : CardView
    private lateinit var cardView4 : CardView
    private lateinit var cardView5 : CardView

    private var action2 : FragmentAction6? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        action2 = context as MainActivity
    }




    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_5, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        cardView1 = view.findViewById(R.id.card5_1)
        cardView2 = view.findViewById(R.id.card5_2)
        cardView3 = view.findViewById(R.id.card5_3)
        cardView4 = view.findViewById(R.id.card5_4)
        cardView5 = view.findViewById(R.id.card5_5)


        cardView1.setOnClickListener {
            action2?.action34()
        }
        cardView2.setOnClickListener {
            action2?.action35()
        }
        cardView3.setOnClickListener {
            action2?.action36()
        }
        cardView4.setOnClickListener {
            action2?.action37()
        }
        cardView5.setOnClickListener {
            action2?.action38()
        }

    }
}

interface FragmentAction6 {
    fun action34()
    fun action35()
    fun action36()
    fun action37()
    fun action38()

}