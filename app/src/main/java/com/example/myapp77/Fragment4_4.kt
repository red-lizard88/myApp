package com.example.myapp77

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class Fragment4_4 : Fragment() {

    private lateinit var txtView : TextView


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txtView = view.findViewById(R.id.Text3)


        val rootRef = FirebaseDatabase.getInstance().reference
        val usersRef = rootRef.child("Лист1/24/Text")
        val valueEventListener: ValueEventListener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                txtView.text = dataSnapshot.value.toString()
            }

            override fun onCancelled(databaseError: DatabaseError) {
            }
        }
        usersRef.addListenerForSingleValueEvent(valueEventListener)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment4_4, container, false)
    }



}