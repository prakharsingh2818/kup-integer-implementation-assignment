trait Integer extends Nat {
  def isZero: Boolean

  def previousInteger: Integer

  def nextInteger: Integer

  def +(that: Integer): Integer

  def -(that: Integer): Integer

  def negate: Integer

  def isPositive: Boolean

  def getSign: Sign

  def printNumber: String
}

