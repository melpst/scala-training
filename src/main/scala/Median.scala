class Median{

  def calcMedian[T:Numeric](s: Seq[T])(implicit n: Numeric[T]): Double = n match {
    case n: Integral[_] => import n._; toDouble(s.sum) / toDouble(fromInt(s.size))
    case n: Fractional[_] => import n._; toDouble(s.sum) / toDouble(fromInt(s.size))
    case _ => sys.error("not a Seq of Integral, Fractional")
  }

  def median[T:Numeric](s: Seq[T]): Double = {
    val sorted = s.sorted
    val mid: Int = s.length / 2

    sorted.length % 2 match {
      case 0 => calcMedian(sorted.slice(mid-1, mid+1))
      case _ => Numeric[T].toDouble(sorted.apply(mid))
    }
  }


}
