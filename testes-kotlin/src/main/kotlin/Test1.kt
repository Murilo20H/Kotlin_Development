package org.github.murilo20h

//import java.lang.Exception
import java.lang.Throwable
import kotlin.Exception

class Test1 (
    private val test1: List<Int> = listOf(1))
{
    fun get(): Int? {
        return this.find()
    }

    fun find(): Int? {
        return test1.get(4)
    }
}


fun main() {
    try {
        Test1().get()

    } catch (e: Exception) {
        println(e)
        println(e.message)
        println(e.localizedMessage)
        println(e.cause)
        println(e.stackTrace)
        println(e.suppressed.toString())
    }
}
