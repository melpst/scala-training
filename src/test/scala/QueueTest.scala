import org.scalatest.FunSuite

class QueueTest extends FunSuite{

  test("q.isEmpty() on queue that cap = 0 will return true"){
    val q = new Queue(0)
    assert(q.isEmpty()===true)
  }

  test("q.isFull() on queue that cap = 0 will return false"){
    val q = new Queue(0)
    assert(q.isFull()===true)
  }

  test("q.isEmpty() on empty queue will return true"){
    val q = new Queue(1)
    assert(q.isEmpty()===true)
  }

  test("q.isFull() on empty queue will return false"){
    val q = new Queue(1)
    assert(q.isFull()===false)
  }

  test("q.isEmpty() on full queue will return false"){
    val q = new Queue(1)
    assert(q.put("hello")===true)
    assert(q.isEmpty()===false)
  }

  test("q.isFull() on full queue will return true"){
    val q = new Queue(1)
    assert(q.put("hello")===true)
    assert(q.isFull()===true)
  }

  test("q.put(hello) to queue that cap = 0 will return false"){
    val q = new Queue(0)
    assert(q.put("hello")===false)
  }

  test("q.get() from queue that cap = 0 will get None"){
    val q = new Queue(0)
    assert(q.get()===None)
  }

  test("q.get() from empty queue will get None"){
    val q = new Queue(1)
    assert(q.get()===None)
  }

  test("q.put(hello) will return true"){
    val q = new Queue(1)
    assert(q.put("hello")===true)
  }

  test("q.put(world) after put(hello) will still return true"){
    val q = new Queue(2)
    assert(q.put("hello")===true)
    assert(q.put("world")===true)
  }

  test("q.put(world) after put(good) and put(afternoon) will return false (out of bound)"){
    val q = new Queue(2)
    assert(q.put("good")===true)
    assert(q.put("afternoon")===true)
    assert(q.put("world")===false)
  }

  test("q.get() will return hello"){
    val q = new Queue(1)
    assert(q.put("hello")===true)
    assert(q.get()===Some("hello"))
  }

  test("q.get() at second time will return world"){
    val q = new Queue(2)
    assert(q.put("hello")===true)
    assert(q.put("world")===true)
    assert(q.get()===Some("hello"))
    assert(q.get()===Some("world"))
  }

  test("q.put(world) after get() after put(hello) will return true®"){
    val q = new Queue(1)
    assert(q.put("hello")===true)
    assert(q.get()===Some("hello"))
    assert(q.put("world")===true)
  }

  test("another test case"){
    val q = new Queue(2)
    assert(q.put("good")===true)
    assert(q.put("afternoon")===true)
    assert(q.get()===Some("good"))
    assert(q.put("world")===true)
    assert(q.get()===Some("afternoon"))
    assert(q.put("!")===true)
  }

  test("another another test case"){
    val q = new Queue(2)
    assert(q.put("good")===true)
    assert(q.put("afternoon")===true)
    assert(q.get()===Some("good"))
    assert(q.put("world")===true)
    assert(q.get()===Some("afternoon"))
    assert(q.put("!")===true)
    assert(q.get()===Some("world"))
    assert(q.get()===Some("!"))
  }

  test("another another another test case"){
    val q = new Queue(2)
    assert(q.put("good")===true)
    assert(q.put("afternoon")===true)
    assert(q.get()===Some("good"))
    assert(q.put("world")===true)
    assert(q.get()===Some("afternoon"))
    assert(q.put("!")===true)
    assert(q.get()===Some("world"))
    assert(q.get()===Some("!"))
    assert(q.get()===None)
    assert(q.get()===None)
    assert(q.put("good")===true)
    assert(q.put("afternoon")===true)
    assert(q.put("good")===false)
    assert(q.put("afternoon")===false)
  }


  test("push too many items to queue will return false"){
    val q = new Queue(2)
    assert(q.put("!")===true)
    assert(q.put("!")===true)
    assert(q.put("!")===false)
    assert(q.put("!")===false)
    assert(q.put("!")===false)
    assert(q.put("!")===false)
  }
}
