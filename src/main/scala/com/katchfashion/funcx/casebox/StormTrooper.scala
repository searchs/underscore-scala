package com.katchfashion.funcx.casebox

object StormTrooper extends App {

  def inspect(person: Person): String = person match {
    case Person("Luke", "SkyWalker") => "Stop, rebel boy!"
    case Person("Han", "Solo") => "Stop another rebel boy!"
    case Person(first, last) => s"Move along, $first "
    case _ => "we have no record of such a person!"
  }

  println(inspect(Person("Noel", "Armstrong")))
  println(inspect(Person("Han", "Solo")))
}
