import org.scalatest.FunSuite

class SquareVectorTest extends FunSuite{

  val int = new SquareVector(Vector[Int](3,4,5))
  val double = new SquareVector(Vector[Double](3,4,5))

  val x = Vector[Double](9,16,25)
  val y = 50
  val z = 7.0710678118654755

  test("double.x will be equal to x"){
    assertResult(x)(double.x)
  }

  test("double.y will be equal to y"){
    assertResult(y)(double.y)
  }

  test("double.z will be equal to z"){
    assertResult(z)(double.z)
  }

  test("int.x will be equal to x"){
    assertResult(x)(int.x)
  }

  test("int.y will be equal to y"){
    assertResult(y)(int.y)
  }

  test("int.z will be equal to z"){
    assertResult(z)(int.z)
  }

}
