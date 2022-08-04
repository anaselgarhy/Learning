package com.anas.learning.kotlin.fund

fun main() {
    // Numbers
    val b: Byte = 127 // -127 to 127 (8 bits)
    val s: Short = 32767 // -32767 to 32767 (16 bits)
    val i: Int = 2147483647 // -2147483647 to 2147483647 (32 bits)
    val l: Long = 9223372036854775807 // -9223372036854775807 to 9223372036854775807 (64 bits)

    // Following numbers
    var f: Float = 3.14f // 32 bits
    var d: Double = 3.14 // 64 bits

    println("b: $b, s: $s, i: $i, l: $l, f: $f, d: $d")
}