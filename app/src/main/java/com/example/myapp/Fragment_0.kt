
package com.example.myapp

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment




class Fragment_0: Fragment() {





    private lateinit var cardView1 : CardView
    private lateinit var cardView2 : CardView
    private lateinit var cardView3 : CardView
    private lateinit var cardView4 : CardView
    private lateinit var cardView5 : CardView
    private lateinit var cardView6 : CardView

 private var action : FragmentAction? = null

  override fun onAttach(context: Context) {
        super.onAttach(context)
        action = context as MainActivity
    }



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_0, container, false)
    }






   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       super.onViewCreated(view, savedInstanceState)
       cardView1 = view.findViewById(R.id.card1)
       cardView2 = view.findViewById(R.id.card2)
       cardView3 = view.findViewById(R.id.card3)
       cardView4 = view.findViewById(R.id.card4)
       cardView5 = view.findViewById(R.id.card5)
       cardView6 = view.findViewById(R.id.card6)

       cardView1.setOnClickListener {
            action?.action()
       }

       cardView2.setOnClickListener {
           action?.action4()
       }

       cardView3.setOnClickListener {
           action?.action5()
       }
       cardView4.setOnClickListener {
           action?.action6()
       }
       cardView5.setOnClickListener {
           action?.action7()
       }
       cardView6.setOnClickListener {
           action?.action8()
       }
    }
}
interface FragmentAction {

    fun action()
    fun action4()
    fun action5()
    fun action6()
    fun action7()
    fun action8()
}


