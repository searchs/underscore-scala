package com.katchfashion.traitsbox

object RunVisitors extends App {


  val anon = Anonymous("Cyril")
  println(anon)
  println(s"ID: ${anon.id}")
  println(s"createdAt: ${anon.createdAt}")
  Thread.sleep(5000) //elongate the life
  println(s"Age: ${anon.age} seconds")
}
