package com.katchfashion.funcx.movies

case class Film(name: String,
                yearOfRelease: Int,
                imdbRating: Double,
                director: Director) {

  def directorsAge: Int = (director.yearOfBirth - yearOfRelease)

  def isDirectedBy(director: Director): Boolean = this.director == director

  def copy(name: String = this.name,
           yearOfRelease: Int = this.yearOfRelease,
           imdbRating: Double = this.imdbRating,
           director: Director = this.director): Unit = Film(name, yearOfRelease, imdbRating, director)

}

object Film {
  def apply(name: String, yearOfRelease: Int, imdbRating: Double, director: Director): Film =
    Film(name, yearOfRelease, imdbRating, director)

  def highestRating(film1: Film, film2: Film): Double =
    if (film1.imdbRating > film2.imdbRating) film1.imdbRating
    else film2.imdbRating

  def oldestDirectorAtTheTime(film1: Film, film2: Film): Director =
    if (film1.directorsAge > film2.directorsAge) film1.director
    else film2.director
}