import FindNotNone._
import org.scalatest.FunSuite

class FindNotNoneTest extends FunSuite{
  val x = None
  val y = Some(4)
  val z = Some(5)

  val noneList = List[Option[Any]](None)
  val emptyList = List[Option[Any]]()
  val notNoneList = List[Option[Any]](x,y,z)

  test("firstNotNone(x,y,z) will return y"){
    assertResult(y.get)(firstNotNone(x,y,z))
  }

  test("firstNotNone(x,x,z) will return z"){
    assertResult(z.get)(firstNotNone(x,x,z))
  }

  test("firstNotNone(x,x,x) will return None"){
    assertResult(None)(firstNotNone(x,x,x))
  }

  test("productIfNotNone(y,y,z) will return y*y*z"){
    assertResult(Some(y.get*y.get*z.get))(productIfNotNone(y,y,z))
  }

  test("productIfNotNone(y,y,y) will return y*y*y"){
    assertResult(Some(y.get*y.get*y.get))(productIfNotNone(y,y,y))
  }

  test("productFromFirstNotNone(x,y,z) will return None"){
    assertResult(None)(productIfNotNone(x,y,z))
  }

  test("firstItemInListThatNotNone(noneList) will return None"){
    assertResult(None)(firstItemInListThatNotNone(noneList))
  }

  test("firstItemInListThatNotNone(emptyList) will return None"){
    assertResult(None)(firstItemInListThatNotNone(emptyList))
  }

  test("firstItemInListThatNotNone(notNone) will return y"){
    assertResult(y)(firstItemInListThatNotNone(notNoneList))
  }
}
