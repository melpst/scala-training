object GCD extends App {
  def gcd(a:Int, b: Int): Int = {
    if (b==0) 1 else if (a%b==0) b else gcd(b, a%b)
  }
}
