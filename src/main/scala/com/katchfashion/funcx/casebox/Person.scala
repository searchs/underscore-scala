package com.katchfashion.funcx.casebox

case class Person(firstName: String, lastName: String) {
  def name: String = firstName + " " + lastName
}

case object Citizen {
  def firstName = "Johnny"
  def lastName = "Smith"
  def name = firstName + " " + lastName
}