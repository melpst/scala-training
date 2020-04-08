object DoubleComparator extends App {

  implicit class Comparator(x:Double) {
    def ~=(y: Double)(implicit diff: Double = 0.5): Boolean = {
      if ((x - y).abs <= diff) true
      else false
    }
  }
}
