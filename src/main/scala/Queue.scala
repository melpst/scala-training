class Queue(cap: Int) extends QueueGeneric {
  private var arr = new Array[String](cap)
  private var head = 0
  private var tail = 0

  def isEmpty(): Boolean = arr.isEmpty

  override def put(t: String): Boolean = {
    if((tail-head)%cap != 0 || tail==head){
      arr(tail%cap) = t
      tail += 1
      true
    }
    else false
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