package com.katchfashion.traitsbox

import java.util.Date

trait Visitor {
  //  It is good practice to never define vals in a trait,
  //  but rather to use def
  def id: String

  def createdAt: Date

  def age: Long = new Date().getTime - createdAt.getTime
}
