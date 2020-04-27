object TimeCounter extends App {

  implicit val printer = Printer(println)

  def timeit[T](f: => T)(implicit printer: Printer): T = {
    val start = System.currentTimeMillis
    val res = f
    val executeTime = System.currentTimeMillis - start
    printer.fn(s"Scope execution time ${executeTime.toString} ns")
    res
  }

}

case class Printer(fn: (String) => Unit)