import org.scalatest._
import Array._

class QueueTest extends FunSuite{
  val q = new Queue

  test("q.put(hello) will return Array(hello)"){
    assert(q.put("hello").sameElements(Array("hello")))
  }

  test("q.put(world) will return Array(hello, world)"){
    assert(q.put("world").sameElements(Array("hello", "world")))
  }

  test("q.get() will return hello"){
    assert(q.get()==="hello")
  }

  test("q.arr must be equal to Array(world)"){
    assert(q.arr.sameElements(Array("world")))
  }

  test("q.get() will return world"){
    assert(q.get()==="world")
  }

  test("q.arr must be empty"){
    assert(q.arr.isEmpty)
  }
}
