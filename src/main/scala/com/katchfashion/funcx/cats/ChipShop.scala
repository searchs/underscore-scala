package com.katchfashion.funcx.cats


object ChipShop extends App {

  //private def willServe(c: Cat): Boolean = if (c.food.toLowerCase() == "chips") true else false

  def willServe(cat: Cat): Boolean = cat match {
    case Cat(_, _, "Chips") => true
    case Cat(_, _, _) => false

  }

  val henderson = Cat(name = "Henderson", colour = "gray", food = "Chips")

  println(ChipShop.willServe(henderson))
}