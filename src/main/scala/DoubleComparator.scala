object DoubleComparator {

  implicit val diff = 0.5

  implicit class Comparator(x:Double) {
    def ~=(y: Double)(implicit diff: Double): Boolean = {
      if ((x - y).abs <= diff) true
      else false
    }
  }
}
