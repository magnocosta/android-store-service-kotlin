package com.teste.model

data class Version(val app: App, val versionCode:String, val versionName: String,  val url: String, val checksun: String) {

    override fun toString(): String {
        return "Version()"
    }

}