package com.katchfashion.traitsbox

import java.util.Date

sealed trait Visitor {
  //  It is good practice to never define vals in a trait, but rather to use def
  def id: String

  def createdAt: Date

  def age: Long = new Date().getTime - createdAt.getTime
}

final case class Anonymous(id: String, createdAt: Date = new Date()) extends Visitor
final case class User(id: String, email: String, createdAt: Date = new Date()) extends Visitor
