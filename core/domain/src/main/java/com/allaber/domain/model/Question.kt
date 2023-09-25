package com.allaber.domain.model

data class Question(
    val id: Int,
    val questionDifficulty: Int,
    val question: String,
    val answer1: String,
    val answer2: String,
    val answer3: String,
    val answer4: String,
    val answer5: String,
    val answer6: String,
    val answer7: String?,
    val answer8: String?,
    val correctAnswer: Int
)
