package com.anilcaliskan.kotlincoroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        val firstJob = launch {
            delay(2000)
            println("first Job")
            val secondJob = launch {
                delay(3000)
                println("second Job")
            }
        }
        firstJob.invokeOnCompletion {
            println("end Jobs")
        }

        //firstJob.cancel()
    }
}