object Tester extends App {
  val one = SuccessiveInteger(Zero)
  val two = SuccessiveInteger(one)
  val three = SuccessiveInteger(two)
  val four = SuccessiveInteger(three)

  val minusOne = SuccessiveInteger(Zero, Negative)
  val minusTwo = SuccessiveInteger(one, Negative)
  val minusThree = SuccessiveInteger(two, Negative)
  val minusFour = SuccessiveInteger(three, Negative)

  /**
   * Tests is Integers are created correctly
   */
  println("------Checking if Integers are created correctly------")
  println("1: " + one.printNumber)
  println("2: " + two.printNumber)
  println("3: " + three.printNumber)
  println("4: " + four.printNumber)
  println("(-1): " + minusOne.printNumber)
  println("(-2): " + minusTwo.printNumber)
  println("(-3): " + minusThree.printNumber)
  println("(-4): " + minusFour.printNumber)


  /**
   * TESTS FOR ZERO
   */
  println("------ZERO------")
  println("Successor of Zero: " + Zero.successor.printNumber)
  println("Predecessor of Zero: " + Zero.predecessor.printNumber)
  println("0 + 2: " + (Zero + two).printNumber)
  println("0 - 2: " + (Zero - two).printNumber)
  println("0 + (-2): " + (Zero + minusTwo).printNumber)
  println("0 - (-2): " + (Zero - minusTwo).printNumber)

  /**
   * TESTES FOR previousInteger
   */
  println("------PREVIOUS NUMBERS------")

  println("Predecessor of One: " + one.previousInteger.printNumber)
  println("Predecessor of Two: " + two.previousInteger.printNumber)
  println("Predecessor of Three: " + three.previousInteger.printNumber)
  println("Predecessor of Four: " + four.previousInteger.printNumber)
  println("Predecessor of Minus One: " + minusOne.previousInteger.printNumber)
  println("Predecessor of Minus Two: " + minusTwo.previousInteger.printNumber)
  println("Predecessor of Minus Three: " + minusThree.previousInteger.printNumber)
  println("Predecessor of Minus Four: " + minusFour.previousInteger.printNumber)

  /**
   * TESTES FOR nextInteger
   */
  println("------Next NUMBERS------")

  println("Successor of One: " + one.nextInteger.printNumber)
  println("Successor of Two: " + two.nextInteger.printNumber)
  println("Successor of Three: " + three.nextInteger.printNumber)
  println("Successor of Four: " + four.nextInteger.printNumber)
  println("Successor of Minus One: " + minusOne.nextInteger.printNumber)
  println("Successor of Minus Two: " + minusTwo.nextInteger.printNumber)
  println("Successor of Minus Three: " + minusThree.nextInteger.printNumber)
  println("Successor of Minus Four: " + minusFour.nextInteger.printNumber)


  /**
   * TESTS FOR + operator
   */
  println("------PLUS------")
  println("1 + 0: " + (one + Zero).printNumber)
  println("(-2) + 0: " + (minusTwo + Zero).printNumber)
  println("1 + 2: " + (one + two).printNumber)
  println("2 + 3: " + (two + three).printNumber)
  println("3 + 4: " + (three + four).printNumber)
  println("4 + 4: " + (four + four).printNumber)
  println("(-1) + 2: " + (minusOne + two).printNumber)
  println("(-2) + 3: " + (minusTwo + three).printNumber)
  println("(-3) + 4: " + (minusThree + four).printNumber)
  println("(-1) + 4: " + (minusOne + four).printNumber)
  println("(-2) + 4: " + (minusTwo + four).printNumber)
  println("(-4) + 4: " + (minusFour + four).printNumber)
  println("1 + (-2): " + (one + minusTwo).printNumber)
  println("1 + (-3): " + (one + minusThree).printNumber)
  println("2 + (-3): " + (two + minusThree).printNumber)
  println("3 + (-4): " + (three + minusFour).printNumber)
  println("1 + (-4): " + (one + minusFour).printNumber)
  println("4 + (-4): " + (four + minusFour).printNumber)
  println("(-1) + (-2): " + (minusOne + minusTwo).printNumber)
  println("(-2) + (-3): " + (minusTwo + minusThree).printNumber)
  println("(-3) + (-4): " + (minusThree + minusFour).printNumber)
  println("(-4) + (-4): " + (minusFour + minusFour).printNumber)


  /**
   * TESTES FOR - operator
   */

  println("------MINUS------")

  println("1 - 0: " + (one - Zero).printNumber)
  println("-2 - 0: " + (minusTwo - Zero).printNumber)
  println("1 - 2: " + (one - two).printNumber)
  println("2 - 1: " + (two - one).printNumber)
  println("2 - 3: " + (two - three).printNumber)
  println("3 - 4: " + (three - four).printNumber)
  println("2 - 4: " + (two - four).printNumber)
  println("4 - 4: " + (four - four).printNumber)
  println("(-1) - 2: " + (minusOne - two).printNumber)
  println("(-2) - 3: " + (minusTwo - three).printNumber)
  println("(-3) - 4: " + (minusThree - four).printNumber)
  println("(-4) - 4: " + (minusFour - four).printNumber)
  println("1 - (-2): " + (one - minusTwo).printNumber)
  println("2 - (-3): " + (two - minusThree).printNumber)
  println("3 - (-4): " + (three - minusFour).printNumber)
  println("4 - (-4): " + (four - minusFour).printNumber)
  println("(-1) - (-2): " + (minusOne - minusTwo).printNumber)
  println("(-2) - (-3): " + (minusTwo - minusThree).printNumber)
  println("(-3) - (-2): " + (minusThree - minusTwo).printNumber)
  println("(-3) - (-4): " + (minusThree - minusFour).printNumber)
  println("(-1) - (-4): " + (minusOne - minusFour).printNumber)
  println("(-2) - (-4): " + (minusTwo - minusFour).printNumber)
  println("(-4) - (-4): " + (minusFour - minusFour).printNumber)

}
