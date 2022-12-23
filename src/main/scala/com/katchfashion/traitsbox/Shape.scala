package com.katchfashion.traitsbox




sealed trait Colour {
  def red: Double

  def green: Double

  def blue: Double

  def isLight: Boolean = (red + green + blue) / 3.0 > 0.5

  def isDark = !isLight
}


case object Red extends Colour {
  val red: Double = 1.0

  val green: Double = 0.0

  val blue: Double = 0.0
}

case object Yellow extends Colour {
  val red: Double = 1.0
  val green: Double = 1.0
  val blue: Double = 0.0
}


case object Pink extends Colour {
  val red = 1.0
  val green = 0.0
  val blue = 1.0
}


final case class CustomColor(red: Double,
                             green: Double,
                             blue: Double) extends Colour


sealed trait Shape {
  def sides: Int

  def perimeter: Double

  def area: Double

  def colour: Colour
}

sealed trait Rectangular extends Shape {
  def width: Double

  def height: Double

  val sides: Int = 4
  val perimeter = 2 * width + 2 * height
  val area = width * height
}


final case class Square(length: Double, colour: Colour) extends Rectangular {
  val width: Double = length
  val height: Double = length
}

final case class Rectangle(height: Double, width: Double, colour: Colour) extends Rectangular
final case class Circle(radius: Double, colour: Colour) extends Shape {
  val sides: Int = 1

  val perimeter: Double = 2 * math.Pi * radius

  val area: Double = math.Pi * radius * radius
}


object Draw {
  def apply(shape: Shape): String = shape match {
    case Rectangle(width, height, colour) => s"\tA Rectangle with width: ${width}cm and ${height}cm coloured ${Draw(colour)}"
    case Square(size, colour) => s"\tA Square of size ${size}cm coloured ${Draw(colour)}"
    case Circle(radius, colour: Colour) => s"\tA Circle of radius ${radius}cm coloured ${Draw(colour)}"
  }


  def apply(colour: Colour): String = colour match {
    case Red => "Red"
    case Yellow => "Yellow"
    case Pink => "Pink"
    case colour => if(colour.isLight) "light" else "dark"
  }

}
