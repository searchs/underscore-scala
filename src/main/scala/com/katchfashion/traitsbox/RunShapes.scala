package com.katchfashion.traitsbox

object RunShapes extends App {
  //Square
  println("\n\t" + "==" * 25 + "\tSQUARES " + "==" * 25)
  println(s"\tSQR Area: ${Square(4, colour = Yellow).area}")
  println(s"\tSQR Perimeter: ${Square(6, Pink).perimeter}")
  println(s"\tSQR Sides: ${Square(9, Red).sides}")

  // Rectangles
  println("\n\t" + "**" * 25 + "\tRECTANGLES " + "**" * 25)
  println(s"\tRECT Area: ${Rectangle(6, 8, Red).area}")
  println(s"\tRECT Perimeter: ${Rectangle(6, 8, Pink ).perimeter}")
  println(s"\tRECT Sides: ${Rectangle(6, 8, Yellow).sides}")

  println("\n\t" + "##" * 25 + "\tCIRCLES " + "##" * 25)
  println(s"\tCIRCLE Area: ${Circle(10, Red).area}")
  println(s"\tCIRCLE Perimeter/Circumference: ${Circle(10, Yellow).perimeter}")
  println(s"\tCIRCLE Sides: ${Circle(10, Pink).sides}")


  println("\n\t" + "##" * 25 + "\tSEALED TRAITS " + "##" * 25)
  println(Draw(Rectangle(3, 5, Yellow)))
  println(Draw(Square(7, Red)))
  println(Draw(Circle(15, Pink)))


  println("\n\t" + "##" * 25 + "\tSEALED TRAITS - COLOUR " + "##" * 25)
  println(Draw(Rectangle(3, 5, CustomColor(0.4,0.4,0.6))))
  println(Draw(Square(7, Red)))
  println(Draw(Circle(15, Pink)))
}
