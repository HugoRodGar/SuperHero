package com.combigames.superhero.feature.superheros.domain

class GetSuperHeroUseCase(private val superHeroRepository: SuperHeroRepository) {

    operator fun invoke(): List<SuperHero> {
        return superHeroRepository.obtainSuperHeros()
    }

}