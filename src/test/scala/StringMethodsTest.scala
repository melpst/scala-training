import org.scalatest._

class StringMethodsTest extends FunSuite{

  val dupWords = "Hello Hello World World oo"

  val longestDupWord = "hello"
  val mostDupWord = "hello"
  val mostDupLetter = 'l'
  val dupMap = scala.collection.mutable.Map[Char, Set[String]]()

  dupMap += ('h' -> Set[String]("hello"))
  dupMap += ('e' -> Set[String]("hello"))
  dupMap += ('l' -> Set[String]("hello", "world"))
  dupMap += ('o' -> Set[String]("hello", "world", "oo"))
  dupMap += ('w' -> Set[String]("world"))
  dupMap += ('r' -> Set[String]("world"))
  dupMap += ('d' -> Set[String]("world"))

  val str = "Given an string containing words separated by space find an following condition"

  val LongestWord = "containing" //10 chars
  val mostCommonWord = "an" //2 freq
  val mostCommonLetter = 'n' //11 freq
  val map = scala.collection.mutable.Map[Char, Set[String]]()

  map += ('a' -> Set[String]("an", "containing", "separated", "space"))
  map += ('b' -> Set[String]("by"))
  map += ('c' -> Set[String]("containing", "space", "condition"))
  map += ('d' -> Set[String]("words", "separated", "find", "condition"))
  map += ('e' -> Set[String]("given", "separated", "space"))
  map += ('f' -> Set[String]("find", "following"))
  map += ('g' -> Set[String]("given", "string", "containing", "following"))
  map += ('i' -> Set[String]("find", "given", "string", "following", "condition", "containing"))
  map += ('l' -> Set[String]("following"))
  map += ('n' -> Set[String]("find", "given", "string", "following", "condition", "an", "containing"))
  map += ('o' -> Set[String]("containing", "words", "following", "condition"))
  map += ('p' -> Set[String]("separated", "space"))
  map += ('r' -> Set[String]("string", "words", "separated"))
  map += ('s' -> Set[String]("string", "words", "separated", "space"))
  map += ('t' -> Set[String]("string", "containing", "separated", "condition"))
  map += ('v' -> Set[String]("given"))
  map += ('w' -> Set[String]("words", "following"))
  map += ('y' -> Set[String]("by"))

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

    assert(result.forall(a => map.contains(a._1) && map(a._1)==(a._2)) ===true)
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

    assert(result.forall(a => dupMap.contains(a._1) && dupMap(a._1)==(a._2)) ===true)
  }
}
