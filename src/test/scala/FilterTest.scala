import org.scalatest.FunSuite

class FilterTest extends FunSuite{

  test("list doesn't in map will return empty list"){

    val list = Array(1,2,3).toList
    val map = Map[Int, Double](4->3,5->5,6->10)

    assert(Filter.res(list,map).sameElements(Array().toList))
  }

  test("some list is in map will return some multiply"){

    val list = Array(1,2,3).toList
    val map = Map[Int, Double](1->3,3->5,6->10)

    assert(Filter.res(list,map).sameElements(Array(3,15).toList))
  }


  test("all list are in map will return all multiply"){

    val list = Array(1,2,3).toList
    val map = Map[Int, Double](1->3,2->5,3->10,4->20)

    assert(Filter.res(list,map).sameElements(Array(3,10,30).toList))
  }
}
