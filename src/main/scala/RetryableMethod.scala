object RetryableMethod {

  implicit val options = RetryOptions(3,1000)

  def retry[T](f: => T)(implicit options: RetryOptions): T = {
    try {
      println(options.times+" time(s) left")
      f
    }
    catch {
      case e =>
        if (options.times > 1) {
          Thread.sleep(options.sleepTime)
          options.times = options.times-1
          retry{f}(options)
        }
        else throw e
    }
  }

}

case class RetryOptions(t: Int, s: Int){
  private var _times = t
  private var _sleepTime = s

  def times = _times
  def times_= (value:Int): Unit = {
    _times = value
  }

  def sleepTime = _sleepTime
  def sleepTime_= (value:Int): Unit = {
    _sleepTime = value
  }
}