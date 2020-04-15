import scala.math._

class SquareVector[T](v: Vector[T])(implicit n: Numeric[T]) {
  lazy val x = this.squareAll
  lazy val y = this.sumSquare
  lazy val z = this.rootSum

  private def squareAll: Vector[T] = v.map(x => n.times(x,x))
  private def sumSquare: Option[T] =
    if(x.isEmpty) None else Some(x.reduce((a,b) => n.plus(a,b)))
  private def rootSum: Option[Double] =
    if(y.isEmpty) None else Some(sqrt(n.toDouble(y.get)))

}