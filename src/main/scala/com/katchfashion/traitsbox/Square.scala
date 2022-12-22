package com.katchfashion.traitsbox

case class Square(length: Double) extends Shape {
  def sides: Int = 4

  def perimeter: Double = length * sides

  def area: Double = length * length
}
