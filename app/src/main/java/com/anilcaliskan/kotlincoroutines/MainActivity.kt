package com.anilcaliskan.kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Global Scope, runBlocking, CoroutineScope

        /*
      GlobalScope.launch {
          repeat(100000){
              launch {
                  println("android")
              }
          }
      }
       */

        /*
        //runBlocking
        println("run blocking start")
        runBlocking {
            launch {
                delay(5000)
                println("run blocking")
            }
        }
        println("run blocking end")
         */

        /*
        //GlobalScope
        println("global scope start")
        GlobalScope.launch {
            delay(5000)
            println("global scope")
        }
        println("global scope end")
         */

        /*
        //CoroutineScope
        println("coroutine scope start")
        CoroutineScope(Dispatchers.Default).launch {
            delay(5000)
            println("coroutine scope")
        }
        println("coroutine scope end")
    }
         */
    }
}