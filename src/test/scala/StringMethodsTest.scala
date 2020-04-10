import org.scalatest._

class StringMethodsTest extends FunSuite{

  val dupWords = "Hello Hello World World oo"

  val longestDupWord = "hello"
  val mostDupWord = "hello"
  val mostDupLetter = 'l'
  val dupMap = scala.collection.mutable.Map[Char, Array[String]]()

  dupMap += ('h' -> Array[String]("hello"))
  dupMap += ('e' -> Array[String]("hello"))
  dupMap += ('l' -> Array[String]("hello", "world"))
  dupMap += ('o' -> Array[String]("hello", "world", "oo"))
  dupMap += ('w' -> Array[String]("world"))
  dupMap += ('r' -> Array[String]("world"))
  dupMap += ('d' -> Array[String]("world"))

  val str = "Given an string containing words separated by space find an following condition"

  val LongestWord = "containing" //10 chars
  val mostCommonWord = "an" //2 freq
  val mostCommonLetter = 'n' //11 freq
  val map = scala.collection.mutable.Map[Char, Array[String]]()

  map += ('a' -> Array[String]("an", "containing", "separated", "space"))
  map += ('b' -> Array[String]("by"))
  map += ('c' -> Array[String]("containing", "space", "condition"))
  map += ('d' -> Array[String]("words", "separated", "find", "condition"))
  map += ('e' -> Array[String]("given", "separated", "space"))
  map += ('f' -> Array[String]("find", "following"))
  map += ('g' -> Array[String]("given", "string", "containing", "following"))
  map += ('i' -> Array[String]("find", "given", "string", "following", "condition", "containing"))
  map += ('l' -> Array[String]("following"))
  map += ('n' -> Array[String]("find", "given", "string", "following", "condition", "an", "containing"))
  map += ('o' -> Array[String]("containing", "words", "following", "condition"))
  map += ('p' -> Array[String]("separated", "space"))
  map += ('r' -> Array[String]("string", "words", "separated"))
  map += ('s' -> Array[String]("string", "words", "separated", "space"))
  map += ('t' -> Array[String]("string", "containing", "separated", "condition"))
  map += ('v' -> Array[String]("given"))
  map += ('w' -> Array[String]("words", "following"))
  map += ('y' -> Array[String]("by"))

  test("mostLongestWord(str) will return Longest Word"){
    assert(StringMethods.longestWord(str)===LongestWord)
  }

  test("mostCommonWord(str) will return most Common Word"){
    assert(StringMethods.mostCommonWord(str)===mostCommonWord)
  }

  test("mostCommonLetter(str) will return most Common Letter"){
    assert(StringMethods.mostCommonLetter(str)===mostCommonLetter)
  }

  test("mapCharToWords(str) will return map"){
    val result = StringMethods.mapCharToWords(str)

    assert(result.forall(a => map.contains(a._1) && map(a._1).sorted.sameElements(a._2.sorted)) ===true)
  }

  test("mostLongestWord(dupWords) will return longestDupWord"){
    assert(StringMethods.longestWord(dupWords)===longestDupWord)
  }

  test("mostCommonWord(dupWords) will return most Common Word"){
    assert(StringMethods.mostCommonWord(dupWords)===mostDupWord)
  }

  test("mostCommonLetter(dupWords) will return most Common Letter"){
    assert(StringMethods.mostCommonLetter(dupWords)===mostDupLetter)
  }

  test("mapCharToWords(dupWords) will return map"){
    val result = StringMethods.mapCharToWords(dupWords)

    assert(result.forall(a => dupMap.contains(a._1) && dupMap(a._1).sorted.sameElements(a._2.sorted)) ===true)
  }
}
