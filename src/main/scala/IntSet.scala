import scala.annotation.tailrec

trait IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def isEmpty: Boolean
  def excl(x: Int): IntSet
  def union(x: IntSet): IntSet
  def intersect(x: IntSet): IntSet
}

class EmptySet extends IntSet {
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = new NonEmptySet(x, new EmptySet, new EmptySet)
  def isEmpty: Boolean = true
  def union(x: IntSet): IntSet = x
  def intersect(x: IntSet): IntSet = this
  def excl(x: Int): IntSet = this

  override def toString: String = ""
}

class NonEmptySet(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def contains(x: Int): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true

  def incl(x: Int): IntSet =
    if (x < elem) new NonEmptySet(elem, left incl x, right)
    else if (x > elem) new NonEmptySet(elem, left, right incl x)
    else this

  def isEmpty: Boolean = false

  def excl(x: Int): IntSet =
    if(!this.contains(x)) this
    else {
      if (x < elem) new NonEmptySet(elem, left.excl(x), right)
      else if (x > elem) new NonEmptySet(elem, left, right.excl(x))
      else left.union(right)
    }

  def union(x: IntSet): IntSet = x match {
    case _: EmptySet => this
    case _: NonEmptySet => left.union(x).union(right).incl(elem)
  }

  def intersect(x: IntSet): IntSet =
    if (x.isEmpty) x
    else if (x.contains(elem)) new NonEmptySet(elem, left.intersect(x), right.intersect(x))
    else (new EmptySet).union(left.intersect(x)).union(right.intersect(x))

  override def toString: String = {
    left.toString
    print(elem+" ")
    right.toString
  }
}

object IntSet {
  def apply(ints: Int*) = {
    var s: IntSet = new EmptySet()
    for (i <- ints) s = s incl i
    s
  }

//  println(IntSet(1, 2, 3).union(IntSet(2, 1, 3)))
//  println(new EmptySet().incl(1).incl(2).incl(3).union(new EmptySet().incl(2).incl(1).incl(3)) )
}