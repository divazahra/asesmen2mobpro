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

    suspend fun getFilm(id: Long): Film? {
        return dao.getFilmById(id)
    }

    fun update(id: Long, judul: String, review: String, genre: String, tanggal: String) {
        val film = Film(
            id = id,
            judul = judul,
            review = review,
            genre = genre,
            tanggal = tanggal
        )

        viewModelScope.launch(Dispatchers.IO) {
            dao.update(film)
        }
    }

    fun softdelete(id: Long) {
        viewModelScope.launch(Dispatchers.IO) {
            dao.softDelete(id)
        }
    }
}