package com.combigames.superhero.feature.users.presentation

import androidx.lifecycle.ViewModel
import com.combigames.superhero.feature.users.domain.GetUserUseCase

class ListViewModel (private val getUserUseCase : GetUserUseCase) : ViewModel() {

    fun getUsers() = getUserUseCase.invoke()

}