object clock {
  def currentTime: Long = System.currentTimeMillis
}


val now = clock.currentTime
println(now)