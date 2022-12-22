package com.katchfashion.traitsbox

object RunShapes extends App {
  //Square
  println("\n\t" + "==" * 25 + " SQUARES " + "==" * 25)
  println(s"\tSQR Area: ${Square(4).area}")
  println(s"\tSQR Perimeter: ${Square(6).perimeter}")
  println(s"\tSQR Sides: ${Square(9).sides}")

  // Rectangles
  println("\n\t" + "**" * 25 + " RECTANGLES " + "**" * 25)
  println(s"\tRECT Area: ${Rectangle(6, 8).area}")
  println(s"\tRECT Perimeter: ${Rectangle(6, 8).perimeter}")
  println(s"\tRECT Sides: ${Rectangle(6, 8).sides}")

  println("\n\t" + "&&" * 25 + " CIRCLES " + "&&" * 25)
  println(s"\tCIRCLE Area: ${Circle(10).area}")
  println(s"\tCIRCLE Perimeter/Circumference: ${Circle(10).perimeter}")
  println(s"\tCIRCLE Sides: ${Circle(10).sides}")


}
