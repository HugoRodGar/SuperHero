package com.combigames.superhero.feature.users.data.local

import com.combigames.superhero.feature.users.domain.User

class UserMemLocalDataSource {

    private val localUsers = mutableListOf(
        User("Dani-el", "Surname1", "12345678A"),
        User("Name2", "Surname2", "12345678B"),
        User("Name3", "Surname3", "12345678C")

    )

    fun getAll() = localUsers

}