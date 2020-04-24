import scala.annotation.tailrec
import math._

object GCD {
  @tailrec
  def gcd(a:Int, b: Int): Int = {
    if (b==0) 1 else if (a%b==0) abs(b) else gcd(b, a%b)
  }
}
