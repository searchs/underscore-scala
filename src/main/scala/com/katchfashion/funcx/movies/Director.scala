package com.katchfashion.funcx.movies


case class Director(firstName: String, lastName: String, yearOfBirth: Int) {

  def name: String = s"$firstName $lastName"

  def copy(
            firstName: String = this.firstName,
            lastName: String = this.lastName,
            yearOfBirth: Int = this.yearOfBirth
          ) = Director(firstName, lastName, yearOfBirth)

}

object Director {
  def apply(firstName: String, lastName: String, yearOfBirth: Int): Director =
    Director(firstName, lastName, yearOfBirth)

  def older(directorOne: Director, directorTwo: Director): Director =
    if (directorOne.yearOfBirth < directorTwo.yearOfBirth) directorOne
    else directorTwo
}
