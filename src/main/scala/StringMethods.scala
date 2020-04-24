object StringMethods {

  implicit class methods(str: String) {
    private def toLower(s: String): Array[String] = s.toLowerCase.split(" ")

    def longestWord: String = toLower(str).maxBy(s => s.length)

    def mostCommonWord: String = toLower(str).maxBy(s => toLower(str).count(a => a.equals(s)))

    def mostCommonLetter: Option[Char] =
      if (str.isEmpty) None
      else Some(toLower(str).map(s => s.toList).flatten
        .maxBy(c => toLower(str).map(s => s.toList).flatten.count(l => l.equals(c))))

    def mapCharToWords: Map[Char, Array[String]] =
      toLower(str).map(s => s.toList.map(c => (c, s))).flatten.groupBy(t => t._1)
        .transform((k, v) => v.map(x => x._2).distinct)
  }
}