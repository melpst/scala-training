import TimeCounter.time
import org.scalatest.FunSuite

class TimeCounterTest extends FunSuite{

  test("insert function to time() will return expected result and print execute time"){
    assertResult(4950)(time(List.range(1,100).sum))
  }
}
