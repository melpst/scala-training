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

  def isEmpty: Boolean = this.elem==0 && left.isEmpty && right.isEmpty

  def excl(x: Int): IntSet =
    if(!this.contains(x)) this
    else {
      if (x < elem) new NonEmptySet(elem, left.excl(x), right)
      else if (x > elem) new NonEmptySet(elem, left, right.excl(x))
      else {
        if (left.isEmpty && right.isEmpty) new EmptySet
        else if (left.isEmpty) right
        else if (right.isEmpty) left
        else {
          val max = left.asInstanceOf[NonEmptySet].findMax
          new NonEmptySet(max, left.excl(max), right)
        }
      }
    }

  private def getElem = elem
  private def getLeft = left
  private def getRight = right

  @tailrec
  private def findMax: Int =
    if (right.isEmpty) elem
    else right.asInstanceOf[NonEmptySet].findMax


  def union(x: IntSet): IntSet = x match {
    case _: EmptySet => this
    case x: NonEmptySet => {
      val nonEmptySet = x.asInstanceOf[NonEmptySet]
      val incl = this.incl(nonEmptySet.getElem)

      if (nonEmptySet.getLeft.isEmpty && nonEmptySet.getRight.isEmpty) incl
      else if (nonEmptySet.getLeft.isEmpty) incl.union(nonEmptySet.getRight)
      else if (nonEmptySet.getRight.isEmpty) incl.union(nonEmptySet.getLeft)
      else incl.union(nonEmptySet.getLeft).union(nonEmptySet.getRight)
    }
  }

  def intersect(x: IntSet): IntSet = x match {
    case x : EmptySet => x
    case x : NonEmptySet =>
      if (x.contains(elem)) new NonEmptySet(elem, left.intersect(x), right.intersect(x))
      else (new EmptySet).union(left.intersect(x)).union(right.intersect(x))
    }

  override def toString: String = {
    left.toString
    print(elem+" ")
    right.toString
  }
}