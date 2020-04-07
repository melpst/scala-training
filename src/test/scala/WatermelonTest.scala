import org.scalatest._

class WatermelonTest extends FunSuite{

  test("Input < 2 will return false"){
    assert(Watermelon.divide(1)===false)
  }

  test("Input == 2 will return false"){
    assert(Watermelon.divide(2)===false)
  }

  test("Input > 2 and Input % 2 == 0  will return true"){
    assert(Watermelon.divide(4)===true)
  }

  test("Input > 2 and Input % 2 != 0  will return false"){
    assert(Watermelon.divide(3)===false)
  }

}
