package org.github.murilo20h

import kotlinx.coroutines.*

suspend fun test() {
    delay(2000L)
    println("Teste")
}

fun main() = runBlocking{
    println("Inicio")
    test()
    println("Final")
}