import org.scalatest.FunSuite

class GCDTest extends FunSuite{

  test("gcd(1,1) return 1"){
    assertResult(1)(GCD.gcd(1,1))
  }

  test("gcd(1,0) return 1"){
    assertResult(1)(GCD.gcd(1,0))
  }

  test("gcd(x,x) return x"){
    assertResult(3)(GCD.gcd(3,3))
  }

  test("gcd(x,y) iff x%y==0 and x>=y and x,y>0 return y"){
    assertResult(5)(GCD.gcd(10,5))
  }

  test("gcd(x,y) iff x%y==0 and x<y and x,y>0 return x"){
    assertResult(5)(GCD.gcd(5,10))
  }

  test("gcd(x,y) iff x%y!=0 and x,y are prime num return 1"){
    assertResult(1)(GCD.gcd(5,3))
  }

  test("gcd(x,y) iff x,y<0 and abs(x), abs(y) are prime number return -1"){
    assertResult(-1)(GCD.gcd(-5,-3))
  }

  test("gcd(x,y) iff x%y==0 and x>=y and x,y<0 return x"){
    assertResult(-2)(GCD.gcd(-2,-4))
  }

  test("gcd(x,y) iff x%y==0 and x<y and x,y<0 return y"){
    assertResult(-2)(GCD.gcd(-4,-2))
  }
}
