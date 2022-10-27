package com.anilcaliskan.kotlincoroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(){
    var username = ""
    var age = 0

    runBlocking {
        val downloadedName = async {
            downloadName()
        }
        val downloadedAge = async {
            downloadAge()
        }
        username = downloadedName.await()
        age = downloadedAge.await()

        println("${username} ${age}")
    }

}
suspend fun downloadName() : String {
    delay(2000)
    val username = "Tugce: "
    println("username download")
    return username
}
suspend fun downloadAge() : Int {
    delay(4000)
    val age = 23
    println("download age")
    return age
}