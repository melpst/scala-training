trait ReverseQueueGeneric extends QueueGeneric {
  abstract override def put(str: String): Boolean = super.put(str.reverse)
}
