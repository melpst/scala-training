object ListObject {

  def listOfStringToChar(arr: Array[String]) : List[Char] = arr.map(s => s.toList).flatten.distinct.toList

}
