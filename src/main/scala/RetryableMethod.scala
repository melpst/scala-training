object RetryableMethod {

  def retry[T](n: Int, f: => T): T = {
    try {
      println(n+" time(s) left")
      f
    }
    catch {
      case e =>
        if (n > 1) retry(n - 1, f)
        else throw e
    }
  }

}
