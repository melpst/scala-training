object TimeCounter {
  def time[T](f: => T): T = {
    val start = System.currentTimeMillis
    val res = f
    val exeTime = System.currentTimeMillis - start
    println(exeTime + " ns")
    res
  }
//
//  def plus(x:Int, y:Int): Int = x+y
//
//  println("hello "+time(List.range(1,100).sum))
//
//  println("world "+time(plus(200000000,230000000)))
}