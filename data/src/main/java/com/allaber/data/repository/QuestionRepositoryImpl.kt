package com.allaber.data.repository

import com.allaber.data.source.local.dao.QuestionDao
import com.allaber.data.source.local.mapper.QuestionMapper
import com.allaber.domain.model.Question
import com.allaber.domain.repository.QuestionRepository
import javax.inject.Inject

class QuestionRepositoryImpl @Inject constructor(
    private val questionDao: QuestionDao,
    private val questionMapper: QuestionMapper
) : QuestionRepository {
    override suspend fun getQuestionById(questionId: Int): Result<Question> {
        return Result.success(Question(1))
    }

    override suspend fun getAllQuestion(): Result<List<Question>> {
        return runCatching {
            val questionListEntity = questionDao.getAllQuestions()
            questionMapper.transform(questionListEntity)
        }.onSuccess {
            Result.success(it)
        }.onFailure {
            Result.failure<List<Question>>(it)
        }
    }
}
