import org.scalatest._

import scala.collection.mutable.ArrayBuffer

class QueueTest extends FunSuite{
  val q = new Queue

  test("q.put(hello) will return Array(hello)"){
    assert(q.put("hello").sameElements(ArrayBuffer("hello")))
  }

  test("q.put(world) will return Array(hello, world)"){
    assert(q.put("world").sameElements(ArrayBuffer("hello", "world")))
  }

  test("q.get() will return hello"){
    assert(q.get().getOrElse(None)==="hello")
  }

  test("q.arr must be equal to Array(world)"){
    assert(q.sameElements(ArrayBuffer("world")))
  }

  test("q.get() will return world"){
    assert(q.get().getOrElse(None)==="world")
  }

  test("q.arr must be empty"){
    assert(q.isEmpty)
  }

  test("q.get() will return none"){
    assert(q.get().getOrElse(None)===None)
  }
}
