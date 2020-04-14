object FindNotNone extends App {
  def firstNotNone(x: Option[Any],y: Option[Any],z: Option[Any]): Any =
    (x,y,z) match {
      case(None, None, None) => None
      case (None, None, z) => z
      case (None, y, _) => y
      case (x,_,_) => x
    }

  def productFromFirstNotNone(x: Option[Any],y: Option[Any],z: Option[Any]): Any =
    (x,y,z) match {
      case (None, None, None) => None
      case (Some(x), _, _) => x
      case (None, Some(y), _) => y
      case (None, None, Some(z)) => z
    }

  def firstItemInListThatNotNone(list: List[Option[Any]]): Option[Any] = list match {
    case List() => None
    case l :: list => l match {
      case None => if (list.dropRight(list.length-2).isEmpty) None else firstItemInListThatNotNone(list.dropRight(list.length-2))
      case l => l
    }
  }

}
