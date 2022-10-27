package com.anilcaliskan.kotlincoroutines

import kotlinx.coroutines.*

fun main(){

    GlobalScope.launch {
        myFunction()
    }
    runBlocking {
        launch {
            delay(2000)
            println("run blocking")
            myFunction()
        }
    }
    // myFunction() -> Cannot be called here. Not suspend func.
}
suspend fun myFunction(){
    coroutineScope {
        launch {
            delay(4000)
            println("suspend func")
        }
    }
}