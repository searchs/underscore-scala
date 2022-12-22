package com.katchfashion.funcx.counters


case class Counter(count: Int = 0) {

  def inc: Counter = copy(count = count + 1)

  def dec: Counter = copy(count = count - 1)

  def inc(n: Int): Counter = copy(count = count  + n)
  def dec(n: Int): Counter = copy(count = count  - n)
    def adjust(adder: Adder): Counter =  copy(adder.add(count))
  //
    def adjustSub(adder: Adder): Counter = copy(adder.sub(count))
}

//object Counter {
//
//  def inc: Counter = Counter(count + 1)
//
//  def dec: Counter = Counter(count - 1)
//
//  def inc(n: Int): Counter = {
//    if (n <= 0) this
//    else inc.inc(n - 1)
//  }
//
//  def dec(n: Int): Counter = {
//    if (n <= 0) this
//    else dec.dec(n - 1)
//  }

//  def adjust(adder: Adder): Counter = new Counter(adder.add(count))
//
//  def adjustSub(adder: Adder): Counter = new Counter(adder.sub(count))

//}
