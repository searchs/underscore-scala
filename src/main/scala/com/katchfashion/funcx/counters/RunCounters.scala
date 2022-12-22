package com.katchfashion.funcx.counters

object RunCounters extends App {

  val counter = new Counter(7)
  println(counter.inc.count)
  println(counter.dec.count)

  println(counter.inc(3).count)
  println(counter.dec(9).count)
  println(counter.adjust(new Adder(4)).count)
  println(counter.adjustSub(new Adder(2)).count)

}
