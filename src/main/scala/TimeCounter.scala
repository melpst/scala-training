object TimeCounter extends App {

  def timeit[T](f: => T)(implicit printer: (String) => Unit = println): T = {
    val start = System.currentTimeMillis
    val res = f
    val executeTime = System.currentTimeMillis - start
    printer(s"Scope execution time ${executeTime.toString} ns")
    res
  }

}
