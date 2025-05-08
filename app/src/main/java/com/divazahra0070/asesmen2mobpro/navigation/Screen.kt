package com.divazahra0070.asesmen2mobpro.navigation

import com.divazahra0070.asesmen2mobpro.screen.KEY_ID_FILM

sealed class Screen(val route: String) {
    data object Home: Screen("mainScreen")
    data object FormBaru: Screen("detailScreen")
    data object FormUbah: Screen("detailScreen/{$KEY_ID_FILM}") {
        fun withID(id: Long) = "detailScreen/$id"
    }
    data object TrashScreen: Screen("trashScreen")
}