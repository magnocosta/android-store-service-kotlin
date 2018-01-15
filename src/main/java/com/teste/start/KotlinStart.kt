package com.teste.start

import com.teste.model.App
import com.teste.model.Version
import sun.plugin2.liveconnect.JavaClass
import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.Persistence

object KotlinStart {

    @JvmStatic fun main(args : Array<String>) : Unit {

        try {

            val emf = Persistence.createEntityManagerFactory("androidStoreService")
            val manager = emf.createEntityManager()

            //val app: App = manager.find(App::class.java, 1)

            val teste: App? = manager.find(App::class.java, 1L)

            val app = App("cielo.apps", "Cielo Store")
            //manager.merge(app)
            manager.persist(app)


            val teste2: App = manager.find(App::class.java, 1L)

            println("Meu primeiro exemplo de metod main com Kotlin")
            println("id: ${teste2.packageName}")
        } catch (error: Exception) {
            error.printStackTrace()
        } finally {
            System.exit(0)
        }

    }

}

