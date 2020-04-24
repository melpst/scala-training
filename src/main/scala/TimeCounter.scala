object TimeCounter extends App {

  def timeit[T](f: => T)(implicit printer: (String) => Unit = println): T = {
    val start = System.currentTimeMillis
    val res = f
    val executeTime = System.currentTimeMillis - start
    printer(executeTime.toString)
    res
  }

//  def plus(x:Int, y:Int): Int = x+y
//
//  println("hello "+timeit(List.range(1,100).sum))

}