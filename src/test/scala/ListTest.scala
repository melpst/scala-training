import org.scalatest.FunSuite

class ListTest extends FunSuite{
  val strArr = Array[String]("hello", "world", "my", "name", "is", "jitlada")
  val splitArr = Array[String]("h","e","l","l","o","w","o","r","l","d","m","y","n","a","m","e","i","s","j","i","t","l","a","d","a")

  val emptyArr = Array[String]("test", "", "empty")
  val splitEmpty = Array[String]("t","e","s","t","","e","m","p","t","y")

  test("listOfStringToChar(strArr) will return splitArr"){
    assert(List.listOfStringToChar(strArr).sameElements(splitArr))
  }

  test("listOfStringToChar(emptyArr) will return splitEmpty"){
    assert(List.listOfStringToChar(emptyArr).sameElements(splitEmpty))
  }
}
