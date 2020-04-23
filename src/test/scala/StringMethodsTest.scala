import org.scalatest._

class StringMethodsTest extends FunSuite{

  val dupWords = "Hello Hello World World oo"

  val longestDupWord = "hello"
  val mostDupWord = "hello"
  val mostDupLetter = 'l'
  val dupMap = Map[Char, Array[String]](
    ('h' -> Array[String]("hello")),
    ('e' -> Array[String]("hello")),
    ('l' -> Array[String]("hello", "world")),
    ('o' -> Array[String]("hello", "world", "oo")),
    ('w' -> Array[String]("world")),
    ('r' -> Array[String]("world")),
    ('d' -> Array[String]("world"))
  )

  val str = "Given an string containing words separated by space find an following condition"

  val LongestWord = "containing" //10 chars
  val mostCommonWord = "an" //2 freq
  val mostCommonLetter = 'n' //11 freq
  val map = Map[Char, Array[String]](
    ('a' -> Array[String]("an", "containing", "separated", "space")),
    ('b' -> Array[String]("by")),
    ('c' -> Array[String]("containing", "space", "condition")),
    ('d' -> Array[String]("words", "separated", "find", "condition")),
    ('e' -> Array[String]("given", "separated", "space")),
    ('f' -> Array[String]("find", "following")),
    ('g' -> Array[String]("given", "string", "containing", "following")),
    ('i' -> Array[String]("find", "given", "string", "following", "condition", "containing")),
    ('l' -> Array[String]("following")),
    ('n' -> Array[String]("find", "given", "string", "following", "condition", "an", "containing")),
    ('o' -> Array[String]("containing", "words", "following", "condition")),
    ('p' -> Array[String]("separated", "space")),
    ('r' -> Array[String]("string", "words", "separated")),
    ('s' -> Array[String]("string", "words", "separated", "space")),
    ('t' -> Array[String]("string", "containing", "separated", "condition")),
    ('v' -> Array[String]("given")),
    ('w' -> Array[String]("words", "following")),
    ('y' -> Array[String]("by"))
  )

  val emptyStr = ""

  val longestEmpty = ""
  val mostCommonWordEmpty = ""
  val mostCommonLetterEmpty = None
  val emptyMap = Map[Char, Array[String]]()

  test("mostLongestWord(str) will return Longest Word"){
    assertResult(LongestWord)(StringMethods.longestWord(str))
  }

  test("mostCommonWord(str) will return most Common Word"){
    assertResult(mostCommonWord)(StringMethods.mostCommonWord(str))
  }

  test("mostCommonLetter(str) will return most Common Letter"){
    assertResult(mostCommonLetter)(StringMethods.mostCommonLetter(str).getOrElse(None))
  }

  test("mapCharToWords(str) will return map"){
    val result = StringMethods.mapCharToWords(str)
    assert(result.forall(a => map.contains(a._1) && map(a._1).sorted.sameElements(a._2.sorted)) ===true)
  }

  test("mostLongestWord(dupWords) will return longestDupWord"){
    assertResult(longestDupWord)(StringMethods.longestWord(dupWords))
  }

  test("mostCommonWord(dupWords) will return most Common Word"){
    assertResult(mostDupWord)(StringMethods.mostCommonWord(dupWords))
  }

  test("mostCommonLetter(dupWords) will return most Common Letter"){
    assertResult(mostDupLetter)(StringMethods.mostCommonLetter(dupWords).getOrElse(None))
  }

  test("mapCharToWords(dupWords) will return map"){
    val result = StringMethods.mapCharToWords(dupWords)
    assert(result.forall(a => dupMap.contains(a._1) && dupMap(a._1).sorted.sameElements(a._2.sorted)) ===true)
  }

  test("mostLongestWord(emptyStr) will return longestEmpty"){
    assertResult(longestEmpty)(StringMethods.longestWord(emptyStr))
  }

  test("mostCommonWord(emptyStr) will return most Common Word"){
    assertResult(mostCommonWordEmpty)(StringMethods.mostCommonWord(emptyStr))
  }

  test("mostCommonLetter(emptyStr) will return most Common Letter"){
    assertResult(mostCommonLetterEmpty)(StringMethods.mostCommonLetter(emptyStr).getOrElse(None))
  }

  test("mapCharToWords(emptyStr) will return emptyMap"){
    val result = StringMethods.mapCharToWords(emptyStr)
    assert(result.forall(a => emptyMap.contains(a._1) && emptyMap(a._1).sorted.sameElements(a._2.sorted)) ===true)
  }
}
