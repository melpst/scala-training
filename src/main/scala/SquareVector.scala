import scala.math._

class SquareVector[T](v: Vector[T])(implicit n: Numeric[T]) {
  lazy val x = this.squareAll
  lazy val y = this.sumSquare
  lazy val z = this.rootSum

  private def squareAll: Vector[Double] = v.map(x => n.toDouble(x)*n.toDouble(x))
  private def sumSquare: Double = x.reduce((a,b) => a+b)
  private def rootSum: Double = sqrt(y)

}