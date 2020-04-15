import org.scalatest.FunSuite

class SquareVectorTest extends FunSuite{

  val int = new SquareVector(Vector[Int](3,4,5))
  val double = new SquareVector(Vector[Double](3,4,5))
  val empty = new SquareVector(Vector[Int]())

  val intX = Vector[Int](9,16,25)
  val doubleX = Vector[Double](9,16,25)
  val y = 50
  val z = 7.0710678118654755

  val emptyVec = Vector[Double]()

  test("double.x will be equal to x"){
    assertResult(doubleX)(double.x)
  }

  test("double.y will be equal to y"){
    assertResult(y)(double.y.get)
  }

  test("double.z will be equal to z"){
    assertResult(z)(double.z.get)
  }

  test("int.x will be equal to x"){
    assertResult(intX)(int.x)
  }

  test("int.y will be equal to y"){
    assertResult(y)(int.y.get)
  }

  test("int.z will be equal to z"){
    assertResult(z)(int.z.get)
  }

  test("empty.x will be equal to Vector[Double]()"){
    assertResult(emptyVec)(empty.x)
  }

  test("empty.y will be equal to None"){
    assertResult(None)(empty.y)
  }

  test("empty.z will be equal to None"){
    assertResult(None)(empty.z)
  }
}
