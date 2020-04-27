import org.scalatest.FunSuite
import RetryableMethod._

class RetryableMethodTest extends FunSuite{

  test("calling retry(3, None.get) will retry None.get 3 times before crash"){
    val options = RetryOptions(5,3000)
    assertThrows[NoSuchElementException](retry{None.get}(options))
  }

  test("calling retry(3, Array(4,5,6)(2)) will return result"){
    assertResult(30)(retry{Array(4,5,6).map(_*2).reduce((a,b) => a+b)})
  }
}
