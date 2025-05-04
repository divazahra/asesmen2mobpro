package com.divazahra0070.asesmen2mobpro.screen

import androidx.lifecycle.ViewModel
import com.divazahra0070.asesmen2mobpro.model.Film

class MainViewModel : ViewModel() {
    val data = listOf(
        Film(
            1,
            "Film 1",
            "Review 1",
        "genre 1",
    "Tanggal 1"
        )
    )
}