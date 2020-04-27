class Queue(cap: Int) extends QueueGeneric {
  private var arr = new Array[String](cap)
  private var head = 0
  private var tail = 0

  def isEmpty(): Boolean = arr.isEmpty
  def isFull(): Boolean = (tail-head)%cap == 0 && head!=tail

  override def put(t: String): Boolean = {
    if(isFull()) false
    else{
      arr(tail%cap) = t
      tail += 1
      true
    }
  }

  override def get(): Option[String] = {
    if(head==tail) None
    else{
      val h = arr(head%cap)
      head += 1
      Some(h)
    }
  }
}