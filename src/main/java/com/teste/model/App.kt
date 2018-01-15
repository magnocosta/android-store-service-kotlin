package com.teste.model

import javax.persistence.*

@Entity(name = "apps")
data class App(

        @Column(name = "package_name", unique = true)
        val packageName: String? = null,

        @Column(name = "display_name", unique = false)
        val displayName: String? = null,

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long? = null

) {

}