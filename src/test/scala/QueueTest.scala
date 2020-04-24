import org.scalatest.FunSuite

class QueueTest extends FunSuite{

  test("q.put(hello) will return true"){
    val q = new Queue(1)
    assert(q.put("hello")==true)
  }

  test("q.put(world) after put(hello) will still return true"){
    val q = new Queue(2)
    q.put("hello")
    assert(q.put("world")==true)
  }

  test("q.put(world) after put(good) and put(afternoon) will return false (out of bound)"){
    val q = new Queue(2)
    q.put("good")
    q.put("afternoon")
    assert(q.put("world")==false)
  }

  test("q.get() will return hello"){
    val q = new Queue(1)
    q.put("hello")
    assert(q.get().getOrElse(None)=="hello")
  }

  test("q.get() at second time will return world"){
    val q = new Queue(2)
    q.put("hello")
    q.put("world")
    q.get()
    assert(q.get().getOrElse(None)=="world")
  }

  test("q.get() from empty queue will get None"){
    val q = new Queue(1)
    assert(q.get().getOrElse(None)===None)
  }

  test("q.put(world) after put(hello) will return false"){
    val q = new Queue(1)
    q.put("hello")
    assertResult(false)(q.put("world"))
  }


  test("q.put(world) after get() after put(hello) will return true®"){
    val q = new Queue(1)
    q.put("hello")
    q.get()
    assertResult(true)(q.put("world"))
  }
}
