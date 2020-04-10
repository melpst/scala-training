object StringMethods {

  def toLowerCase(str: String): Array[String]= str.split(" ").map(s => s.toList.map(c => c.toLower).mkString(""))

  def longestWord(str: String): String = toLowerCase(str).maxBy(s => s.length)

  def mostCommonWord(str: String): String = toLowerCase(str).maxBy(s => toLowerCase(str).count(a => a.equals(s)))

  def mostCommonLetter(str: String): Char = toLowerCase(str).map(s => s.toList).flatten
                                                            .maxBy(c => toLowerCase(str).map(s => s.toList).flatten.count(l => l.equals(c)))

  def mapCharToWords(str: String) : scala.collection.mutable.Map[Char,Set[String]] = {
    val map = scala.collection.mutable.Map[Char, Set[String]]()

    toLowerCase(str).map(s => s.toList.map(c => (c, s))).flatten
      .sortBy(a => a._1.toInt)
      .map(a => {
        if(!map.contains(a._1)){
          map += (a._1 -> Set[String](a._2))
        }
        else{
          map(a._1) += a._2
        }
      })
    map
  }

}