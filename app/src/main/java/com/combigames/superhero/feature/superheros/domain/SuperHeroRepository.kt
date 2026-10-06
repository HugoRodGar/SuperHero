package com.combigames.superhero.feature.superheros.domain

interface SuperHeroRepository {

    fun obtainSuperHeros() : List<SuperHero>

}