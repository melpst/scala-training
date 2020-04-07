import scala.io.StdIn._

object Watermelon {
  def divide(input: Int) : Boolean = {
    if (input % 2 == 0 && input > 2) true
    else false
  }

  def main(args: Array[String]): Unit ={
    if(divide(readInt())) println("YES")
    else println("NO")
  }
}