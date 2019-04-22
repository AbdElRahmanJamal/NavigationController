package com.s.navigationcontroller


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_seven_days.*


class SevenDays : Fragment() {
    lateinit var player: Player
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_seven_days, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        player = Player(playerName = "CR7", playerNumber = "7", playerTeam = "JUV")

        button_details.setOnClickListener {
            //these 2 lines to navigate from seven days to details
            val goToDetails = SevenDaysDirections.goToDetails(player)
            Navigation.findNavController(it).navigate(goToDetails)

        }
        button_settings.setOnClickListener {
            //these 2 lines to navigate from seven days to details
            val goToSettings = SevenDaysDirections.goToSettings()
            Navigation.findNavController(it).navigate(goToSettings)

        }
    }

}
