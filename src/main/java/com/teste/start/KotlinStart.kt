package com.teste.start

import com.teste.model.App
import com.teste.model.Version

object KotlinStart {

    @JvmStatic fun main(args : Array<String>) : Unit {

        val app = App("cielo.apps")
        val version = Version()

        println("Meu primeiro exemplo de metod main com Kotlin")

        println("App: ${app}")
        println("Version: ${version}")
    }

}