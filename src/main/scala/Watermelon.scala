import scala.io.StdIn._

object Watermelon {
  def divide(input: Int) : String = {
    if (input % 2 == 0 && input > 2) {
      "YES"
    }
    else {
      "NO"
    }
  }

  def main(args: Array[String]): Unit ={
    println(divide(readInt()))
  }
}