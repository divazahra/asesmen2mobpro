package com.divazahra0070.asesmen2mobpro.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "film")
data class Film (
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val judul: String,
    val review: String,
    val genre: String,
    val tanggal: String,
    val isDeleted: Boolean = false
)