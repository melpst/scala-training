class Median{

  def calcMedian(s: Seq[Double], mid: Int): Double =
    (s.apply(mid-1)+s.apply(mid))/2

  def medianInt(s: Seq[Int]): Option[Double] =
    medianDouble(s.map(x => x.toDouble))

  def medianDouble(s:Seq[Double]):Option[Double] =
    if(s.isEmpty) None
    else {
      val sorted = s.sorted
      val mid: Int = s.length / 2

      sorted.length % 2 match {
        case 0 => Some(calcMedian(sorted, mid))
        case _ => Some(sorted.apply(mid))
      }
    }
}
