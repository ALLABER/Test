package com.allaber.domain.repository

import com.allaber.domain.model.Question

interface QuestionRepository {
    suspend fun getQuestionById(questionId: Int): Result<Question>
    suspend fun getAllQuestion(): Result<List<Question>>
}
