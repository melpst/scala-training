import TimeCounter.timeit
import org.scalatest.FunSuite

class TimeCounterTest extends FunSuite{
  test("insert function to timeit() will return expected result and print execution time"){

    implicit val info = (s: String) => println("Execution time is " + s + " ns")

    assertResult(4950)(timeit{ List.range(1,100).sum })
  }

  test("insert a block of for loop will return expected result and print execution time"){

    implicit val info = (s: String) => println("Execution time is " + s + " ns")

    assertResult(200000)(
      timeit{
        var j = 0
        for(i <- 0 to 100000){
          j = i*2
        }
        j
      }
    )
  }
}
