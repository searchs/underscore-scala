package com.katchfashion.funcx.counters

object RunCounters extends App {

//  val counter = Counter(7)
  println(Counter(7).inc.count)
  println(Counter().inc.count)

  println(Counter().inc(3).count)
  println(Counter().dec(6).inc.count)
  println(Counter().adjust(new Adder(4)).count)
  println(Counter().adjustSub(new Adder(2)).count)

}
