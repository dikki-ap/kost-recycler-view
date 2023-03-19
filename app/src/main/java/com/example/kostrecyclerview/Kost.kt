package com.example.kostrecyclerview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Kost(
    var name: String = "",
    var place: String = "",
    var price: String = "",
    var description: String = "",
    var photo: Int = 0
) : Parcelable