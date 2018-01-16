package com.teste.start

import com.teste.model.App
import com.teste.model.Version
import sun.plugin2.liveconnect.JavaClass
import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.EntityTransaction
import javax.persistence.Persistence
import javax.transaction.Transaction

object KotlinStart {

    @JvmStatic fun main(args : Array<String>) : Unit {

        try {

            val emf = Persistence.createEntityManagerFactory("androidStoreService")
            val manager:EntityManager = emf.createEntityManager()
            val tx: EntityTransaction = manager.getTransaction()
            tx.begin()

            val app = App("cielo.apps", "Cielo Store")
            manager.persist(app)

            println("Meu primeiro exemplo de metod main com Kotlin")
            tx.commit()
        } catch (error: Exception) {
            error.printStackTrace()
        } finally {
            System.exit(0)
        }

    }

}

