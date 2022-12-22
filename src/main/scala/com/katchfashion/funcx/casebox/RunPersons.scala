package com.katchfashion.funcx.casebox

object RunPersons extends App {
  val ola = Citizen
  println(ola)
  println(ola.name)

  val person = Person("Jake Billboards")
  println(s"Full name: ${person.name}")
  println(s"First name: ${person.firstName}")
  println(s"Last name: ${person.lastName}")
}
