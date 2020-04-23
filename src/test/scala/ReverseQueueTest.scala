import org.scalatest.FunSuite

class ReverseQueueTest extends FunSuite{

  test("q.put(hello) will return Array(olleh)"){

    val word = "hello"
    val q = new ReverseQueue(1)
    q.put(word)
    assertResult(word.reverse)(q.get().getOrElse(None))
  }

}
