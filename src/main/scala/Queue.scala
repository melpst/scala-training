import scala.collection.mutable.ArrayBuffer

class Queue extends QueueGeneric {
  private var arr = ArrayBuffer.empty[String]

  def isEmpty(): Boolean = arr.isEmpty

  def sameElements(array: ArrayBuffer[String]): Boolean = arr.sameElements(array)

  def put(str: String): ArrayBuffer[String] = {
    arr.addOne(str)
  }

  def get(): Option[String] = {
    if(!arr.isEmpty) {
      Some(arr.remove(0))
    }
    else None
  }
}