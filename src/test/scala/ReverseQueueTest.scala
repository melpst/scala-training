import org.scalatest.FunSuite

class ReverseQueueTest extends FunSuite{

  test("q.put(hello) will return Array(olleh)"){
    val q = new ReverseQueue(1)
    q.put("hello")
    assertResult("olleh")(q.get().getOrElse(None))
  }

}
