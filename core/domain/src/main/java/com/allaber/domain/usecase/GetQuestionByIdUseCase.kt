package com.allaber.domain.usecase

import com.allaber.domain.model.Question
import com.allaber.domain.repository.QuestionRepository
import javax.inject.Inject

class GetQuestionByIdUseCase @Inject constructor(
    private val repository: QuestionRepository
) {
    suspend operator fun invoke(questionId: Int): Result<Question> {
        return repository.getQuestionById(questionId = questionId)
    }
}
