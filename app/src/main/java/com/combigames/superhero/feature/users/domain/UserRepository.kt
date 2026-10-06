package com.combigames.superhero.feature.users.domain

interface UserRepository {

    fun obtainUsers() : List<User>

}