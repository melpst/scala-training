import org.scalatest._

class WatermelonTest extends FunSuite{

  test("Input < 2 will return NO"){
    assert(Watermelon.divide(1)==="NO")
  }

  test("Input == 2 will return NO"){
    assert(Watermelon.divide(2)==="NO")
  }

  test("Input > 2 and Input % 2 == 0  will return YES"){
    assert(Watermelon.divide(4)==="YES")
  }

  test("Input > 2 and Input % 2 != 0  will return NO"){
    assert(Watermelon.divide(3)==="NO")
  }

}
