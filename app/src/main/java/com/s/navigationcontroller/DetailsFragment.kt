package com.s.navigationcontroller

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_details.*


class DetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button_seven_days.setOnClickListener {
            //these 2 lines to navigate from seven days to details
            // val goToSevenDays = DetailsFragmentDirections.goToSevenDays()
            //if i not pass any thing i can use id like it
            Navigation.findNavController(it).navigate(R.id.goToSevenDays)

        }
        button_home.setOnClickListener {
            //these 2 lines to navigate from seven days to details
            //if i not pass any thing i can use id like it
            Navigation.findNavController(it).navigate(R.id.backToHome)
        }
        //to get data from safe args
        arguments?.let {
            //this line to get data from safe args
            val player = DetailsFragmentArgs.fromBundle(it)
            details.text = player.playerDetails.toString()
        }
    }
}
