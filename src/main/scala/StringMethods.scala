object StringMethods {

  def toLower(str: String): Array[String] = str.toLowerCase.split(" ")

  def longestWord(str: String): String = toLower(str).maxBy(s => s.length)

  def mostCommonWord(str: String): String = toLower(str).maxBy(s => toLower(str).count(a => a.equals(s)))

  def mostCommonLetter(str: String): Option[Char] =
    if (str.isEmpty) None
    else Some(toLower(str).map(s => s.toList).flatten
    .maxBy(c => toLower(str).map(s => s.toList).flatten.count(l => l.equals(c))))

  def mapCharToWords(str: String): Map[Char, Array[String]] =
    toLower(str).map(s => s.toList.map(c => (c, s))).flatten.groupBy(t => t._1)
    .transform((k, v) => v.map(x => x._2).distinct)
}