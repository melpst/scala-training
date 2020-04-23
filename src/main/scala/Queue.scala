class Queue(n: Int) extends QueueGeneric {
  private var arr = new Array[String](n)
  private var head = 0
  private var tail = 0

  def isEmpty(): Boolean = head==tail==0

  override def put(t: String): Boolean = {
    if(tail<arr.length) {
      arr(tail) = t
      tail += 1
      true
    }
    else false
  }

  override def get(): Option[String] = {
    if(head<tail) {
      val h = arr(head)
      head += 1
      Some(h)
    }
    else None
  }
}