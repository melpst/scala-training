import org.scalatest.FunSuite

class ListTest extends FunSuite{
  val strArr = Array[String]("hello", "world", "my", "name", "is", "jitlada")
  val strSet = Set[Char]('h','e','l','o','w','r','d','m','y','n','a','i','s','j','t')

  val someEmptyArr = Array[String]("test", "", "empty")
  val someEmptySet = Set[Char]('t','e','s','m','p','y')


  val allEmptyArr = Array[String]("", "")
  val allEmptySet = Set[Char]()

  test("listOfStringToChar(strArr) will return strSet"){
    assert(ListObject.listOfStringToChar(strArr)===strSet)
  }

  test("listOfStringToChar(someEmptyArr) will return someEmptySet"){
    assert(ListObject.listOfStringToChar(someEmptyArr)===someEmptySet)
  }

  test("listOfStringToChar(allEmptyArr) will return allEmptySet"){
    assert(ListObject.listOfStringToChar(allEmptyArr)===allEmptySet)
  }
}
