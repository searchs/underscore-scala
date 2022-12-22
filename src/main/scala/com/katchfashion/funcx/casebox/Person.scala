package com.katchfashion.funcx.casebox

case class Person(firstName: String, lastName: String) {
  def name: String = firstName + " " + lastName

}

object Person {
  def apply(name: String): Person = {
    val parts = name.split(" ")
    apply(parts(0), parts(1))
  }

}

case object Citizen {
  def firstName = "Johnny"

  def lastName = "Smith"

  def name = firstName + " " + lastName
}