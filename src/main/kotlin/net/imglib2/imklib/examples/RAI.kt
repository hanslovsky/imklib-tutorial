package net.imglib2.imklib.examples

import net.imglib2.RandomAccessibleInterval
import net.imglib2.imklib.extensions.*
import net.imglib2.img.array.ArrayImgs
import net.imglib2.type.numeric.real.DoubleType
import net.imglib2.util.Intervals

fun main() {
    val img1 = ArrayImgs.doubles(
            doubleArrayOf(
                    1.0,  2.0,  3.0,  4.0,
                    5.0,  6.0,  7.0,  8.0,
                    9.0, 10.0, 11.0, 12.0),
            4, 3) as RandomAccessibleInterval<DoubleType>
    println("${img1.iterable().map { it.realDouble }}")
    println(img1[0, 1])
    println(img1[1, 0])
    val img2 = img1 + 1.0
    println("${img2.iterable().map { it.realDouble }}")


    (0 until img1.dimension(1)).forEach {
        val img = img1[AX, it]
        println("dim 1 at $it: $img ${img.iterable().map { it.realDouble }}")
    }

    (0 until img1.dimension(0)).forEach {
        val img = img1[AX(it, it), AX]
        println("dim 0 at $it: $img ${img.iterable().map { it.realDouble }}")
    }

    val img3 = img1[AX..2]
    println("${Intervals.minAsLongArray(img3).map { it }} ${Intervals.maxAsLongArray(img3).map { it }} ${img3.iterable().map { it.realDouble }}")

    val img4 = img1 / img2
    println("${img4.iterable().map { it.realDouble }}")

    val img5 = (img1 / 10.0).exp()
    println("${img5.iterable().map { it.realDouble }}")

}