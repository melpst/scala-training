object SquareList {
  def squareListCase(xs: List[Int]): List[Int] = xs match {
    case List() => xs
    case y :: ys => ys.prepended(y).map(y => y*y)
  }
  def squareList(xs: List[Int]): List[Int] = {
    xs map(x => x*x)
  }
}
