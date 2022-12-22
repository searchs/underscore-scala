package com.katchfashion.funcx

object Calc extends App{

  private def square(d: Double): Double = d  * d
  private def cube(c: Double): Double = square(c) * c


  private def square(d: Int): Double = d * d
  private def cube(c: Int): Double = square(c) * c
}
