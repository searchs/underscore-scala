package com.katchfashion.funcx.movies

object Dad extends App {

  def rate(film: Film): Double = film match {
    case Film(_, _, _, Director("Clint", "Eastwood", _)) => 10.0
    case Film(_, _, _, Director("John", "McTiernan", _)) => 7.0
    case Film(_, _, _, _) => 3.0
  }

  val film1 = new Film("The Good, The Bad and the Ugly", 1979, 9.8, Director("Clint", "Eastwood", 1949))
  val film2 = new Film("Die Hard 2.0", 1994, 9.2, Director("John", "McTiernan", 1958))
  val film3 = new Film("Ólēkú", 1979, 5.6, Director("Tunde", "Kilani", 1962))

  //  Quick check
  println(rate(film1))
  println(rate(film2))
  println(rate(film3))
}
