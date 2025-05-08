package com.divazahra0070.asesmen2mobpro.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.divazahra0070.asesmen2mobpro.model.Film

@Database(entities = [Film::class], version = 2, exportSchema = false)
abstract class FilmDb : RoomDatabase() {

    abstract val dao: FilmDao

    companion object {

        @Volatile
        private var INSTANCE: FilmDb? = null

        // Migrasi dari versi 1 ke versi 2: Tambahkan kolom isDeleted
        private val MIGRATION_1_2 = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL(
                    "ALTER TABLE film ADD COLUMN isDeleted INTEGER NOT NULL DEFAULT 0"
                )
            }
        }

        fun getInstance(context: Context): FilmDb {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        FilmDb::class.java,
                        "film.db"
                    )
                        .addMigrations(MIGRATION_1_2) // Tambahkan migrasi di sini
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}

