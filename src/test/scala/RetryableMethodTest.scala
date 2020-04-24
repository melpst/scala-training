import org.scalatest.FunSuite

class RetryableMethodTest extends FunSuite{

  test("calling retry(3, None.get) will retry None.get 3 times before crash"){
    assertThrows[NoSuchElementException](RetryableMethod.retry(3,None.get))
  }

  test("calling retry(3, Array(4,5,6)(2)) will return result"){
    assertResult(6)(RetryableMethod.retry(3,Array(4,5,6)(2)))
  }
}
