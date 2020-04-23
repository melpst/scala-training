import org.scalatest.FunSuite

class SquareListTest extends FunSuite{
  val init = List[Int](1,2,3,4)
  val result = List[Int](1,4,9,16)

  val empty = List()

  test("squareList(empty) will return empty"){
    assertResult(empty)(SquareList.squareList(empty))
  }

  test("squareListCase(empty) will return empty"){
    assertResult(empty)(SquareList.squareListCase(empty))
  }

  test("squareList(init) will return result"){
    assertResult(result)(SquareList.squareList(init))
  }

  test("squareListCase(init) will return result"){
    assertResult(result)(SquareList.squareListCase(init))
  }
}
