package net.imglib2.imklib.examples

import net.imglib2.type.numeric.RealType
import net.imglib2.type.numeric.real.DoubleType
import net.imglib2.imklib.extensions.*

fun <T: RealType<T>> add(dt1: T) {
    val dt2 = dt1 + dt1
    val dt3 = dt1 + dt2
    val dt4 = dt3 + 1.0
//    val dt5 = 123 + dt4
    println("Added: $dt1 $dt2 $dt3 $dt4")// $dt5")
}

fun <T: RealType<T>> subtract(dt1: T) {
    val dt2 = dt1 - 2.0
    val dt3 = dt1 - dt2
    val dt4 = dt3 - 1.0
//    val dt5 = 123 - dt4
    println("Subtracted: $dt1 $dt2 $dt3 $dt4")// $dt5")
}

fun <T: RealType<T>> multiply(dt1: T) {
    val dt2 = dt1 * dt1
    val dt3 = dt1 * dt2
    val dt4 = dt3 * 2.0
//    val dt5 = 123 * dt4
    println("Multiplied: $dt1 $dt2 $dt3 $dt4")// $dt5")
}

fun <T: RealType<T>> divide(dt1: T) {
    val dt2 = dt1 / 3.0
    val dt3 = dt1 / dt2
    println("Divided: $dt1 $dt2 $dt3")// $dt4 $dt5")
}

fun main() {
    add(DoubleType(1.0))
    subtract(DoubleType(2.0))
    multiply(DoubleType(.133153))
    divide(DoubleType(137.0))
}