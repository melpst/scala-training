trait QueueGeneric {
  def put(str: String): Array[String]
  def get(): String
}

class Queue extends QueueGeneric {
  var arr: Array[String] = Array()

  def put(str: String): Array[String] = {
    arr = arr.appended(str)
    arr
  }

  def get(): String = {
    val head = arr.head
    arr = arr.drop(1)
    head
  }
}