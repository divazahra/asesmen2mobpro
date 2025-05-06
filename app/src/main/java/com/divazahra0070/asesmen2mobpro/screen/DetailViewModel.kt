package com.divazahra0070.asesmen2mobpro.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.divazahra0070.asesmen2mobpro.database.FilmDao
import com.divazahra0070.asesmen2mobpro.model.Film
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DetailViewModel(private val dao: FilmDao) : ViewModel() {

    fun insert(judul: String, review: String, genre: String, tanggal: String) {
        val film = Film(
            judul = judul,
            review = review,
            genre = genre,
            tanggal = tanggal
        )

        viewModelScope.launch(Dispatchers.IO) {
            dao.insert(film)
        }
    }

    fun getFilm(id: Long): Film? {
        return null
    }
}