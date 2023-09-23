package com.allaber.data.di

import android.content.Context
import androidx.room.Room
import com.allaber.data.repository.QuestionRepositoryImpl
import com.allaber.data.source.local.AppDatabase
import com.allaber.data.source.local.dao.QuestionDao
import com.allaber.data.source.local.mapper.QuestionMapper
import com.allaber.domain.repository.QuestionRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object QuestionModule {

    @Provides
    @Singleton
    fun provideAppDatabase(
        @ApplicationContext app: Context
    ) = Room.databaseBuilder(
        app,
        AppDatabase::class.java,
        "database"
    ).build()

    @Provides
    @Singleton
    fun provideQuestionDao(database: AppDatabase) = database.getQuestionDao()

    @Provides
    @Singleton
    fun bindQuestionRepo(
        questionDao: QuestionDao,
        questionMapper: QuestionMapper
    ): QuestionRepository = QuestionRepositoryImpl(
        questionDao = questionDao,
        questionMapper = questionMapper
    )
}
