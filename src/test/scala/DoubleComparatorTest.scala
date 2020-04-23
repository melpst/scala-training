import org.scalatest.FunSuite
import DoubleComparator._

class DoubleComparatorTest extends FunSuite{
  test("abs(x-y) > 0.5(default) will be false"){
    assert((1 ~= 2)===false)
  }

  test("abs(x-y) = 0.5(default) will be true"){
    assert((1 ~= 1.5)===true)
  }

  test("abs(x-y) < 0.5(default) will be true"){
    assert((1 ~= 1.3)===true)
  }

  test("abs(x-y) > 1(param) will be false"){
    assert((1 ~= 3)(1)===false)
  }

  test("abs(x-y) = 1(param) will be true"){
    assert((1 ~= 2)(1)===true)
  }

  test("abs(x-y) < 1(param) will be true"){
    assert((1 ~= 1.3)(1)===true)
  }
}
