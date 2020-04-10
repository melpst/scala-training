import org.scalatest.FunSuite

class ListTest extends FunSuite{
  val strArr = Array[String]("hello", "world", "my", "name", "is", "jitlada")
  val strSet = Set[Char]('h','e','l','l','o','w','o','r','l','d','m','y','n','a','m','e','i','s','j','i','t','l','a','d','a')

  val someEmptyArr = Array[String]("test", "", "empty")
  val someEmptySet = Set[Char]('t','e','s','t','e','m','p','t','y')


  val allEmptyArr = Array[String]("", "")
  val allEmptySet = Set[Char]()

  test("listOfStringToChar(strArr) will return splitArr"){
    assert(List.listOfStringToChar(strArr)===strSet)
  }

  test("listOfStringToChar(someEmptyArr) will return someEmptySet"){
    assert(List.listOfStringToChar(someEmptyArr)===someEmptySet)
  }

  test("listOfStringToChar(allEmptyArr) will return allEmptySet"){
    assert(List.listOfStringToChar(allEmptyArr)===allEmptySet)
  }
}
