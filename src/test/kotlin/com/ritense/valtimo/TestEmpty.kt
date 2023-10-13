package com.ritense.valtimo

fun main() {
    println("adawdw")
    var list = lijstje()
    println("4: ${list.getOrNull(4)}")
    println("size = ${list.size}")
    list[1] = 'Z'
    println("1: ${list.getOrNull(1)}")
    println("size = ${list.size}")
}

fun lijstje(): MutableList<Char> {
    return listOf('a', 'b', 'c').toMutableList()
}