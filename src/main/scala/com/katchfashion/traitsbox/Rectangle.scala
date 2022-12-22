package com.katchfashion.traitsbox

case class Rectangle(height: Double, width: Double) extends Shape {
  val sides: Int = 4

  val perimeter: Double = height * 2 + width * 2

  val area: Double = height * width
}
