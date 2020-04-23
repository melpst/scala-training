trait QueueGeneric {
  def put(str: String): Boolean
  def get(): Option[String]
}