import org.scalatest.FunSuite

class MedianTest extends FunSuite{

  val intOddSeq = Seq[Int](1,2,3,4,5)
  val intEvenSeq = Seq[Int](1,2,3,4,5,6)

  val doubleOddSeq = Seq[Double](1.0,2.0,3.0,4.0,5.0)
  val doubleEvenSeq = Seq[Double](1.0,2.0,3.0,4.0,5.0,6.0)

  val medOdd = 3
  val medEven = 3.5

  val emptySeq = Seq[Double]()

  val m = new Median

  test("median(intOddSeq) will return medOdd"){
    assertResult(medOdd)(m.medianInt(intOddSeq).get)
  }

  test("median(intEvenSeq) will return medEven"){
    assertResult(medEven)(m.medianInt(intEvenSeq).get)
  }

  test("median(doubleOddSeq) will return medOdd"){
    assertResult(medOdd)(m.medianDouble(doubleOddSeq).get)
  }

  test("median(doubleEvenSeq) will return medEven"){
    assertResult(medEven)(m.medianDouble(doubleEvenSeq).get)
  }

  test("median(emptySeq) will return None"){
    assertResult(None)(m.medianDouble(emptySeq))
  }

}
