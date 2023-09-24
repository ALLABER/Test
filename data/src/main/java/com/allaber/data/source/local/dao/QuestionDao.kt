package com.allaber.data.source.local.dao

import androidx.room.Dao
import androidx.room.Query
import com.allaber.data.source.local.entity.QuestionEntity

@Dao
interface QuestionDao {
    @Query("SELECT * FROM question WHERE id = :id")
    fun getQuestionById(id: Int): QuestionEntity

    @Query("SELECT * FROM question")
    fun getAllQuestions(): List<QuestionEntity>
}
