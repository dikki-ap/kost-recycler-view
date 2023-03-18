package com.example.kostrecyclerview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Kost(
    val name: String,
    val place: String,
    val price: String,
    val description: String,
    val photo: Int
) : Parcelable