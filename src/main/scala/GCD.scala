import scala.annotation.tailrec
import math._

object GCD {
  @tailrec
  def gcd(a:Int, b: Int): Int = (a,b) match {
    case (_, 0) => 1
    case (a, b) => if (a % b == 0) abs(b) else gcd(b, a % b)
  }
}
