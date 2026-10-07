package com.combigames.superhero.feature.superheros.data

import com.combigames.superhero.feature.superheros.data.local.SuperHeroMemLocalDataSource
import com.combigames.superhero.feature.superheros.domain.SuperHero
import com.combigames.superhero.feature.superheros.domain.SuperHeroRepository

class SuperHeroDataRepository(private val localDataSource: SuperHeroMemLocalDataSource): SuperHeroRepository {

    override fun obtainSuperHeros(): List<SuperHero> {
        return localDataSource.getAll()
    }

}