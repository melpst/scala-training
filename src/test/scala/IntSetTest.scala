import org.scalatest.FunSuite

class IntSetTest extends FunSuite{

  val emptySet = new EmptySet
  val nonEmptySet = new NonEmptySet(1, new EmptySet, new EmptySet)
  val nonNonEmptySet = new NonEmptySet(2, nonEmptySet, new NonEmptySet(6, emptySet,new NonEmptySet(9, emptySet,emptySet)))

  test ("emptySet.isEmpty will return true"){
    assert(emptySet.isEmpty===true)
  }

  test ("nonEmptySet.isEmpty will return false"){
    assert(nonEmptySet.isEmpty===false)
  }

  test("emptySet.contains(3) will return false"){
    assert(emptySet.contains(1)===false)
  }

  test("nonEmptySet.contains(3) will return true"){
    assert(nonEmptySet.contains(1)===true)
  }

  test("emptySet.incl(3) will contain 3"){
    val incl = emptySet.incl(3)
    assert(incl.contains(3)===true)
  }

  test("nonNonEmptySet.contains(2) will be true"){
    assert(nonNonEmptySet.contains(2)===true)
  }

  test("nonNonEmptySet.contains(1) will be true"){
    assert(nonNonEmptySet.contains(1)===true)
  }

  test("nonNonEmptySet.excl(1) will not contain 1"){
    val excl = nonNonEmptySet.excl(1)
    assert(excl.contains(1)===false)
  }

  test("nonNonEmptySet.excl(1) will still contain 2"){
    val excl = nonNonEmptySet.excl(1)
    assert(excl.contains(2)===true)
  }

  test("emptySet.union(nonEmptySet) will contain 1"){
    assert(emptySet.union(nonEmptySet).contains(1)===true)
  }

  test("incl.union(nonNonEmptySet) will contain 1,2,4,6,9"){
    val incl = nonEmptySet.incl(4)
    val union = incl.union(nonNonEmptySet)

    assert(union.contains(1)===true)
    assert(union.contains(2)===true)
    assert(union.contains(4)===true)
    assert(union.contains(6)===true)
    assert(union.contains(9)===true)
  }

  test("emptySet.intersect(nonEmptySet) will be empty"){
    assert(emptySet.intersect(nonEmptySet).isEmpty===true)
  }

  test("nonEmptySet.intersect(nonNonEmptySet) will contain 1"){
    val intersect = nonEmptySet.intersect(nonNonEmptySet)

    assert(intersect.contains(1)===true)
  }


  test("nonEmptySet.intersect(nonNonEmptySet) will not contain 2,4,6,9"){
    val intersect = nonEmptySet.intersect(nonNonEmptySet)

    assert(intersect.contains(2)===false)
    assert(intersect.contains(4)===false)
    assert(intersect.contains(6)===false)
    assert(intersect.contains(9)===false)
  }

  test("nonEmptySet.incl(2).intersect(nonNonEmptySet) will contain 1,2 and not contain 4,6,9"){
    val intersect = nonEmptySet.incl(2).intersect(nonNonEmptySet)

    assert(intersect.contains(1)===true)
    assert(intersect.contains(2)===true)
    assert(intersect.contains(4)===false)
    assert(intersect.contains(6)===false)
    assert(intersect.contains(9)===false)

  }


}
