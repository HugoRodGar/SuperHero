package com.combigames.superhero.feature.users.domain

class GetUserUseCase(private val userRepository: UserRepository) {

    operator fun invoke(): List<User> {
        return userRepository.obtainUsers()
    }

}