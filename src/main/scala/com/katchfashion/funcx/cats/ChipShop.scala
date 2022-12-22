package com.katchfashion.funcx.cats

object ChipShop extends App {

private def willServe(c: Cat): Boolean = if (c.food.toLowerCase() == "chips") true else false


  val henderson = new Cat(colour = "gray", food = "Chipsa")

  println(ChipShop.willServe(henderson))
}