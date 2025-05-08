package com.divazahra0070.asesmen2mobpro.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.divazahra0070.asesmen2mobpro.database.FilmDao
import com.divazahra0070.asesmen2mobpro.model.Film
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class TrashViewModel(private val dao: FilmDao) : ViewModel() {

    val data: StateFlow<List<Film>> = dao.getDeletedFilm().stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(),
        initialValue = emptyList()
    )

    fun pulihkan(id: Long) {
        viewModelScope.launch(Dispatchers.IO) {
            dao.restore(id)
        }
    }

    fun hapusPermanen(id: Long) {
        viewModelScope.launch(Dispatchers.IO) {
            dao.deleteById(id)
        }
    }
}
