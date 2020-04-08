import org.scalatest.FunSuite
import scala.collection.mutable.ArrayBuffer

class ReverseQueueTest extends FunSuite{
  val q = new ReverseQueue

  test("q.put(hello) will return Array(olleh)"){
    assert(q.put("hello").sameElements(ArrayBuffer("olleh")))
  }

  test("q.put(world) will return Array(olleh, dlrow)"){
    assert(q.put("world").sameElements(ArrayBuffer("olleh", "dlrow")))
  }

  test("q.get() will return olleh"){
    assert(q.get().getOrElse(None)==="olleh")
  }

  test("q.arr must be equal to Array(dlrow)"){
    assert(q.sameElements(ArrayBuffer("dlrow")))
  }

  test("q.get() will return dlrow"){
    assert(q.get().getOrElse(None)==="dlrow")
  }

  test("q.arr must be empty"){
    assert(q.isEmpty)
  }

  test("q.get() will return none"){
    assert(q.get().getOrElse(None)===None)
  }
}
