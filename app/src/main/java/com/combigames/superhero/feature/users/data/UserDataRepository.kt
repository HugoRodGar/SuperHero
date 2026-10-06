package com.combigames.superhero.feature.users.data

import com.combigames.superhero.feature.users.data.local.UserMemLocalDataSource
import com.combigames.superhero.feature.users.domain.User
import com.combigames.superhero.feature.users.domain.UserRepository

class UserDataRepository(private val localDataSource: UserMemLocalDataSource) : UserRepository{

    override fun obtainUsers(): List<User> {
        return localDataSource.getAll()
    }

}