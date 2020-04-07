import org.scalatest._

class QueueTest extends FunSuite{
  val q = new Queue

  test("q.put(hello) will return Array(hello)"){
    assert(q.put("hello").sameElements(Array("hello")))
  }

  test("q.put(world) will return Array(hello, world)"){
    assert(q.put("world").sameElements(Array("hello", "world")))
  }
}
