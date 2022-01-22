import org.scalatest.flatspec.AnyFlatSpec

class SuccessiveIntegerTest extends AnyFlatSpec {

  behavior of "IntegerTest"

  val one: SuccessiveInteger = SuccessiveInteger(Zero)
  val two: SuccessiveInteger = SuccessiveInteger(one)

  val minusOne: SuccessiveInteger = SuccessiveInteger(Zero, Negative)
  val minusTwo: SuccessiveInteger = SuccessiveInteger(one, Negative)

  "isZero" should "be true for Zero" in {
    assert(Zero.isZero)
  }
  it should "be false for any other value" in {
    assert(!one.isZero)
  }

  "previousInteger" should "return the value before the current value" in {
    assertResult("+1")(two.previousInteger.printNumber)
    assertResult("-3")(minusTwo.previousInteger.printNumber)
  }

  "nextInteger" should "return the value after the current value" in {
    assertResult("+2")(one.nextInteger.printNumber)
    assertResult("-1")(minusTwo.nextInteger.printNumber)
  }

  "+" should "add the 2 integers" in {
    assertResult("+2")((one + one).printNumber)
    assertResult("-2")((minusOne + minusOne).printNumber)
  }

  "-" should "should subtract the 2 integer" in {
    assertResult("+1")((two - one).printNumber)
    assertResult("-1")((one - two).printNumber)
    assertResult("-3")((minusOne - two).printNumber)
  }

  "negate" should "return the value after negating" in {
    assert(minusTwo.negate.printNumber == "+2")
    assertResult("-1")(one.negate.printNumber)
  }

  "isPositive" should "return true if the integer is Positive" in {
    assert(one.isPositive)
  }

  it should "return false if the integer is Negative" in {
    assert(!minusOne.isPositive)
  }
}
