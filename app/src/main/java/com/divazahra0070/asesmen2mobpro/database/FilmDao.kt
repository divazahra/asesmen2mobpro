package com.divazahra0070.asesmen2mobpro.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.divazahra0070.asesmen2mobpro.model.Film
import kotlinx.coroutines.flow.Flow

@Dao
interface FilmDao {

    @Insert
    suspend fun insert(film: Film)

    @Update
    suspend fun update(film: Film)

    @Query("SELECT * FROM film ORDER BY judul DESC")
    fun getFilm(): Flow<List<Film>>

    @Query("SELECT * FROM film WHERE id = :id")
    suspend fun getFilmById(id: Long): Film?
}