package com.katchfashion.traitsbox

case class Circle(radius: Double) extends Shape {
   val sides: Int = 1

  val perimeter: Double = 2 * math.Pi * radius

   val area: Double = math.Pi * radius * radius
}
