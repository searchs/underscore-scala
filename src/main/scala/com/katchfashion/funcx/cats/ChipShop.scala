package com.katchfashion.funcx.cats


object ChipShop extends App {

  //private def willServe(c: Cat): Boolean = if (c.food.toLowerCase() == "chips") true else false

  def willServe(cat: Cat): Boolean = cat match {
    case Cat(_, "Chips") => true
    case Cat(_, _) => false

  }

  val henderson = Cat(colour = "gray", food = "Chips")
  println(henderson)
  println(ChipShop.willServe(henderson))
  println(henderson.sound)
}