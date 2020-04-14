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
    assertResult(y)(firstNotNone(x,y,z))
  }

  test("firstNotNone(x,x,z) will return z"){
    assertResult(z)(firstNotNone(x,x,z))
  }

  test("firstNotNone(x,x,x) will return x"){
    assertResult(x)(firstNotNone(x,x,x))
  }

  test("productFromFirstNotNone(x,y,z) will return y.get"){
    assertResult(y.get)(productFromFirstNotNone(x,y,z))
  }

  test("productFromFirstNotNone(x,x,z) will return z.get"){
    assertResult(z.get)(productFromFirstNotNone(x,x,z))
  }

  test("productFromFirstNotNone(x,x,x) will return x.get"){
    assertResult(x)(productFromFirstNotNone(x,x,x))
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
