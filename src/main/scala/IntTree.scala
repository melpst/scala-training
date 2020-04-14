abstract class IntTree{
  def contains(t: IntTree, v: Int): Boolean = t match {
    case EmptyTree => false
    case Node(elem, left, right) => elem==v || contains(left,v) || contains(right,v)
  }
  def insert(t: IntTree, v: Int): IntTree = t match {
    case EmptyTree => new Node(v, EmptyTree, EmptyTree)
    case Node(elem, left, right) =>
      if (v<elem) new Node(elem, insert(left,v), right)
      else if (v>elem) new Node(elem, left, insert(right, v))
      else this
  }
}
case object EmptyTree extends IntTree
case class Node(elem: Int, left: IntTree, right: IntTree) extends IntTree