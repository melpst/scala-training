object DoubleComparator extends App {
  def ~=(x:Double, y:Double)(implicit diff:Double = 0.5): Boolean = {
    if((x-y).abs <= diff) true
    else false
  }
}
