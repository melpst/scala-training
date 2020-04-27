object FindNotNone extends App {
  def firstNotNone[T](x: Option[T],y: Option[T],z: Option[T]): Option[T] = x.orElse(y.orElse(z.orElse(None)))

  def productIfNotNone(x: Option[Int],y: Option[Int],z: Option[Int]): Option[Int] =
    if (x.isDefined && y.isDefined && z.isDefined) Some(x.get*y.get*z.get)
    else None

  def firstItemInListThatNotNone(list: List[Option[Any]]): Option[Any] = list match {
    case List() => None
    case first :: others => first match {
      case None => firstItemInListThatNotNone(others)
      case first => first
    }
  }

}
