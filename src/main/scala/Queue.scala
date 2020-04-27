class Queue(cap: Int) extends QueueGeneric {
  private var arr = new Array[String](cap)
  private var head = 0
  private var tail = 0

  def isEmpty(): Boolean = arr.isEmpty

  override def put(t: String): Boolean = {
    if(tail<cap) {
      arr(tail) = t
      tail += 1
      true
    }
    else if (tail==cap && head > 0) {
      val tmp = arr.slice(head,tail)
      arr = tmp ++ new Array[String](head)
      tail -= head
      head = 0

      arr(tail) = t
      tail +=1
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