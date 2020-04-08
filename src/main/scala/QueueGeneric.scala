import scala.collection.mutable.ArrayBuffer

trait QueueGeneric {
  def put(str: String): ArrayBuffer[String]
  def get(): Option[String]
}