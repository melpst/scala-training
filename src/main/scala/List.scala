object List {

  def listOfStringToChar(arr: Array[String]) : Set[Char] = arr.map(s => s.toList).flatten.toSet

}
