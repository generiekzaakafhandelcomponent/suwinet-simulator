package com.ritense.valtimo

fun main() {
    println("adawdw")
    var list = lijstje()
    val bla = list.getOrNull(4)?: "nopes"
    println("4: $bla")
    println("size = ${list.size}")
    list[1] = 'Z'
    println("1: ${list.getOrNull(1)}")
    println("size = ${list.size}")
}

fun lijstje(): MutableList<Char> {
    return listOf('a', 'b', 'c').toMutableList()
}