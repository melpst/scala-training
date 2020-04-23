import org.scalatest.FunSuite

class GCDTest extends FunSuite{

  test("gcd(1,1) return 1"){
    assert(GCD.gcd(1,1)===1)
  }

  test("gcd(1,0) return 1"){
    assert(GCD.gcd(1,0)===1)
  }

  test("gcd(x,x) return x"){
    assert(GCD.gcd(3,3)===3)
  }

  test("gcd(x,y) iff x%y==0 and x>=y and x,y>0 return y"){
    assert(GCD.gcd(10,5)===5)
  }

  test("gcd(x,y) iff x%y==0 and x<y and x,y>0 return x"){
    assert(GCD.gcd(5,10)===5)
  }

  test("gcd(x,y) iff x%y!=0 and x,y are prime num return 1"){
    assert(GCD.gcd(5,3)===1)
  }

  test("gcd(x,y) iff x,y<0 and abs(x), abs(y) are prime number return -1"){
    assert(GCD.gcd(-5,-3)===(-1))
  }

  test("gcd(x,y) iff x%y==0 and x>=y and x,y<0 return x"){
    assert(GCD.gcd(-2,-4)===(-2))
  }

  test("gcd(x,y) iff x%y==0 and x<y and x,y<0 return y"){
    assert(GCD.gcd(-4,-2)===(-2))
  }
}
