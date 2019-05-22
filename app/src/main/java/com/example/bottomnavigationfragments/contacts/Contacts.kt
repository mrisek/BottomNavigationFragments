package com.example.bottomnavigationfragments.contacts

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

import com.example.bottomnavigationfragments.R

class Contacts : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        val view= inflater.inflate(R.layout.fragment_contacts, container,false)

        view.findViewById<Button>(R.id.example_activity_btn).setOnClickListener {
            findNavController().navigate(R.id.action_nav_contacts_to_exampleActivity)
        }

        view.findViewById<Button>(R.id.example_fragment_btn).setOnClickListener {
            findNavController().navigate(R.id.action_nav_contacts_to_exampleFragment)
        }

        return view
    }

}
