package com.katchfashion.funcx.companuums

object RunCompos extends App {
  case class TimeCapsule(h: Int, m: Int, s: Int)

  println(s"Time in seconds: ${Timestamp(1, 1, 1).seconds}")
  println(s"Time in seconds - CAPSULE: ${Timestamp(3,2,1).seconds}")
}
