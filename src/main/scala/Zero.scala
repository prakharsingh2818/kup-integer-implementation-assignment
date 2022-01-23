case object Zero extends Integer {
  def isZero: Boolean = true

  def predecessor: Integer = SuccessiveInteger(Zero, Negative)

  def successor: Integer = SuccessiveInteger(Zero, Positive)

  def +(that: Integer): SuccessiveInteger = {
    if (that.asInstanceOf[SuccessiveInteger].sign == Positive)
      SuccessiveInteger(that.predecessor, Positive)
    else Zero.-(SuccessiveInteger(that.predecessor, Positive))
  }

  def -(that: Integer): SuccessiveInteger = {
    if (that.asInstanceOf[SuccessiveInteger].sign == Positive)
      SuccessiveInteger(that.predecessor, Negative)
    else Zero.+(SuccessiveInteger(that.predecessor, Positive))
  }

  override def printNumber: String = "0"

  override def negate: Integer = Zero

  override def getSign: Sign = Positive

  override def isPositive: Boolean = true

  override def previousInteger: Integer = predecessor

  override def nextInteger: Integer = successor
}

