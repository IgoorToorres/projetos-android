package com.example.aulaactivityfragment

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.io.Serializable
@Parcelize
data class Filme(
    val nome: String,
    val diretor: String,
    val nota: Double
):Parcelable