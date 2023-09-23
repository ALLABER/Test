package com.allaber.test.presentation.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.allaber.domain.usecase.GetAllQuestionsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getAllQuestionsUseCase: GetAllQuestionsUseCase
) : ViewModel() {

    fun fetchAllQuestions() {
        viewModelScope.launch(Dispatchers.IO) {
            getAllQuestionsUseCase().onSuccess {
                it.size
            }
        }
    }
}
