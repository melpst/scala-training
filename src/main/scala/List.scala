object List{

  def listOfStringToChar(arr: Array[String]) : Array[String] = {
    val strArr = arr.map(s => s.split(""))
    strArr.flatten
  }
}
