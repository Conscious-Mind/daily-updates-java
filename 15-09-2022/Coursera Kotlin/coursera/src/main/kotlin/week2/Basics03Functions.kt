@file:JvmName("Basic03Functions")
package week2

fun main() {
    displayMax(7, 55)
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun displayMax(a: Int, b: Int) = println(max(a, b))