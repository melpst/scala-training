object Filter extends App {
  def res(list: List[Int], map: Map[Int, Double]): List[Double] =
    list.filter(l => map.keySet.contains(l)).map(l => l*map.get(l).get)

}
