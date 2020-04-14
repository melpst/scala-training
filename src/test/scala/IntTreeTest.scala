import org.scalatest.FunSuite
class IntTreeTest extends FunSuite{

  val emptyTree = EmptyTree
  val node = new Node(2, emptyTree, emptyTree)

  test("contains(emptyTree, 2) will return false"){
    assert(emptyTree.contains(emptyTree, 2)===false)
  }

  test("contains(node, 2) will return true"){
    assert(emptyTree.contains(node, 2)===true)
  }

  test("insert(emptyTree, 2) will contain 2"){
    val notEmpty = emptyTree.insert(emptyTree,2)
    assert(emptyTree.contains(notEmpty, 2)===true)
  }

  test("insert(node, 1) will contain 1,2"){
    val notEmpty = emptyTree.insert(node,1)
    assert(emptyTree.contains(notEmpty, 1)===true)
    assert(emptyTree.contains(notEmpty, 2)===true)
  }
}
