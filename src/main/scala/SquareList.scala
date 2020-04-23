object SquareList {
  def squareListCase(xs: List[Int]): List[Int] = xs match {
    case List() => xs
    case y :: ys => y*y :: squareListCase(ys)
  }
  def squareList(xs: List[Int]): List[Int] = {
    xs map(x => x*x)
  }
}
