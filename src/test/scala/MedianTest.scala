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
    assertResult(medOdd)(m.median(intOddSeq))
  }

  test("median(intEvenSeq) will return medEven"){
    assertResult(medEven)(m.median(intEvenSeq))
  }

  test("median(doubleOddSeq) will return medOdd"){
    assertResult(medOdd)(m.median(doubleOddSeq))
  }

  test("median(doubleEvenSeq) will return medEven"){
    assertResult(medEven)(m.median(doubleEvenSeq))
  }

  test("median(emptySeq) will return NaN"){
    assert(m.median(emptySeq).equals(Double.NaN))
  }

}
