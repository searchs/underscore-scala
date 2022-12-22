package com.katchfashion.funcx.counters


case class Counter(count: Int = 0) {

  def inc: Counter = copy(count = count + 1)

  def dec: Counter = copy(count = count - 1)

  def inc(n: Int): Counter = copy(count = count + n)

  def dec(n: Int): Counter = copy(count = count - n)

  def adjust(adder: Adder): Counter = copy(adder.add(count))

  def adjustSub(adder: Adder): Counter = copy(adder.sub(count))
}

