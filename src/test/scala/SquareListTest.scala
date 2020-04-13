import org.scalatest.FunSuite

class SquareListTest extends FunSuite{
  val init = List[Int](1,2,3,4)
  val result = List[Int](1,4,9,16)

  val empty = List()

  test("squareList(empty) will return empty"){
    assert(SquareList.squareList(empty).sameElements(empty))
  }

  test("squareListCase(empty) will return empty"){
    assert(SquareList.squareListCase(empty).sameElements(empty))
  }

  test("squareList(init) will return result"){
    assert(SquareList.squareList(init).sameElements(result))
  }

  test("squareListCase(init) will return result"){
    assert(SquareList.squareListCase(init).sameElements(result))
  }
}
