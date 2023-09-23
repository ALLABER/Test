package com.allaber.data.source.local.mapper

import com.allaber.data.source.local.entity.QuestionEntity
import com.allaber.domain.model.Question
import javax.inject.Inject

class QuestionMapper @Inject constructor() {

    fun transform(questionListEntity: List<QuestionEntity>): List<Question> {
        return questionListEntity.map {
            Question(
                id = it.id
            )
        }
    }
}
