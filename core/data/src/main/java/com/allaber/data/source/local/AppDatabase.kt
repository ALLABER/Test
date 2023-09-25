package com.allaber.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.allaber.data.source.local.dao.QuestionDao
import com.allaber.data.source.local.entity.QuestionEntity

@Database(
    version = 1,
    entities = [
        QuestionEntity::class
    ]
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getQuestionDao(): QuestionDao
}
