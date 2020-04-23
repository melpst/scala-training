object FindNotNone extends App {
  def firstNotNone(x: Option[Any],y: Option[Any],z: Option[Any]): Any =
    if (x.isDefined) x
    else if (y.isDefined) y
    else z

  def productFromFirstNotNone(x: Option[Any],y: Option[Any],z: Option[Any]): Any =
    if (x.isDefined) x.get
    else if (y.isDefined) y.get
    else z.getOrElse(None)

  def firstItemInListThatNotNone(list: List[Option[Any]]): Option[Any] = list match {
    case List() => None
    case l :: list => l match {
      case None => if (list.isEmpty) None else firstItemInListThatNotNone(list)
      case l => l
    }
  }

}
