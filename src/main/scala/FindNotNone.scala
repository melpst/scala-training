object FindNotNone extends App {
  def firstNotNone(x: Option[Any],y: Option[Any],z: Option[Any]): Any = x.getOrElse(y.getOrElse(z.getOrElse(None)))

  def productIfNotNone(x: Option[Int],y: Option[Int],z: Option[Int]): Option[Int] =
    if (x.isDefined && y.isDefined && z.isDefined) Some(x.get*y.get*z.get)
    else None

  def firstItemInListThatNotNone(list: List[Option[Any]]): Option[Any] = list match {
    case List() => None
    case l :: list => l match {
      case None => firstItemInListThatNotNone(list)
      case l => l
    }
  }

}
