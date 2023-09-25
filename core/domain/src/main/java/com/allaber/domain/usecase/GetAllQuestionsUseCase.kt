package com.allaber.domain.usecase

import com.allaber.domain.model.Question
import com.allaber.domain.repository.QuestionRepository
import javax.inject.Inject

class GetAllQuestionsUseCase @Inject constructor(
    private val repository: QuestionRepository
) {
    suspend operator fun invoke(): Result<List<Question>> {
        return repository.getAllQuestion()
    }
}
