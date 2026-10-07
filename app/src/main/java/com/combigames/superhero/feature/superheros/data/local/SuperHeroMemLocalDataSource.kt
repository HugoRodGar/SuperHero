package com.combigames.superhero.feature.superheros.data.local

import com.combigames.superhero.feature.superheros.domain.SuperHero


class SuperHeroMemLocalDataSource {

    private val localSuperHeros = mutableListOf(
        SuperHero("1","Xokas","xokas","https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/1-a-bomb.jpg"),
        SuperHero("2","Roca","roca","https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/1-a-bomb.jpg"),
        SuperHero("3","Saitama","saitama","https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/1-a-bomb.jpg")
    )

    fun getAll() = localSuperHeros

}