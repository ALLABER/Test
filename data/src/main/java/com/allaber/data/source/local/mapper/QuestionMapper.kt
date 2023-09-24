package com.allaber.data.source.local.mapper

import com.allaber.data.source.local.entity.QuestionEntity
import com.allaber.domain.model.Question
import javax.inject.Inject

class QuestionMapper @Inject constructor() {

    fun transform(questions: List<QuestionEntity>): List<Question> {
        return questions.map {
            transform(it)
        }
    }

    fun transform(question: QuestionEntity): Question {
        return Question(
            id = question.id,
            questionDifficulty = question.questionDifficulty,
            question = question.question,
            answer1 = question.answer1,
            answer2 = question.answer2,
            answer3 = question.answer3,
            answer4 = question.answer4,
            answer5 = question.answer5,
            answer6 = question.answer6,
            answer7 = question.answer7,
            answer8 = question.answer8,
            correctAnswer = question.correctAnswer
        )
    }
}
