import scala.collection.mutable.ArrayBuffer

trait ReverseQueueGeneric extends QueueGeneric {
  abstract override def put(str: String): ArrayBuffer[String] = super.put(str.reverse)
}
