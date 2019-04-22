package com.s.navigationcontroller

import android.os.Parcel
import android.os.Parcelable

data class Player(
    private val playerName: String?,
    private val playerNumber: String?,
    private val playerTeam: String?
) :Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun toString(): String {
        return "Player Name : $playerName , Player Number : $playerNumber , Player Team : $playerTeam"
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(playerName)
        parcel.writeString(playerNumber)
        parcel.writeString(playerTeam)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Player> {
        override fun createFromParcel(parcel: Parcel): Player {
            return Player(parcel)
        }

        override fun newArray(size: Int): Array<Player?> {
            return arrayOfNulls(size)
        }
    }
}