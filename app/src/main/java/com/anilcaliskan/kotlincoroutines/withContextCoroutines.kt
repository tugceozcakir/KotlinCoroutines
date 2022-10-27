package com.anilcaliskan.kotlincoroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext

fun main(){
    runBlocking {
        launch (Dispatchers.Default) {
            println("${coroutineContext}")
            withContext(Dispatchers.IO) {
                println("${coroutineContext}")
            }
        }
    }
}