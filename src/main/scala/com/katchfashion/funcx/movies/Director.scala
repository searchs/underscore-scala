package com.katchfashion.funcx.movies


case class Director(val firstName: String, val lastName: String, val yearOfBirth: Int) {

  def name: String = s"$firstName $lastName"

  def copy(
            firstName: String = this.firstName,
            lastName: String = this.lastName,
            yearOfBirth: Int = this.yearOfBirth
          ) = new Director(firstName, lastName, yearOfBirth)

}

object Director {
  def apply(firstName: String, lastName: String, yearOfBirth: Int): Director =
    new Director(firstName, lastName, yearOfBirth)

  def older(directorOne: Director, directorTwo: Director): Director =
    if(directorOne.yearOfBirth < directorTwo.yearOfBirth) directorOne
    else directorTwo
}
