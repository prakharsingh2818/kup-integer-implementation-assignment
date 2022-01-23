import scala.annotation.tailrec

case class SuccessiveInteger(number: Nat, sign: Sign = Positive) extends Integer {

  override def isZero: Boolean = false

  override def predecessor: Nat = number

  def previousInteger: Integer = {
    if (number == Zero) {
      if (sign == Negative) SuccessiveInteger(this, sign)
      else Zero
    }
    else if (sign == Positive) SuccessiveInteger(this.predecessor.predecessor, sign)
    else SuccessiveInteger(this.successor, Negative)
  }

  override def successor: Nat = this

  def nextInteger: Integer = {
    if (number == Zero) {
      if (sign == Positive) SuccessiveInteger(this, sign)
      else Zero
    }
    else if (sign == Positive) SuccessiveInteger(this, sign)
    else SuccessiveInteger(this.predecessor.predecessor, Negative)
  }

  override def +(that: Integer): Integer = {
    if (that.isZero) this
    else {
      (this.sign, that.getSign) match {
        case (Positive, Positive) => SuccessiveInteger(that + this.previousInteger)
        case (Positive, Negative) => if (this == that) Zero else (that.negate - this).negate
        case (Negative, Positive) => if (this == that) Zero else that - this.negate
        case (Negative, Negative) => (this.negate + that.negate).negate
      }
    }
  }

  override def -(that: Integer): Integer = {
    if (that.isZero) this
    else {
      (this.sign, that.getSign) match {
        case (Positive, Positive) => if (this == that) Zero else this.previousInteger - that.previousInteger
        case (Negative, Positive) => (this.negate + that).negate
        case (Positive, Negative) => this + that.negate
        case (Negative, Negative) => if (this == that) Zero else that.negate - this.negate
      }
    }
  }

  override def negate: SuccessiveInteger = SuccessiveInteger(number, this.sign.negate)

  override def isPositive: Boolean = if (sign == Positive) true else false

  override def getSign: Sign = this.sign

  private def isEmpty: Boolean = if (number == Zero) true else false

  private def count: Int = {
    @tailrec
    def value(number: SuccessiveInteger, accumulator: Int = 0): Int = {
      if (number.isEmpty) accumulator
      else {
        if (number.sign == Positive) value(number.previousInteger.asInstanceOf[SuccessiveInteger], accumulator + 1)
        else value(number.nextInteger.asInstanceOf[SuccessiveInteger], accumulator + 1)
      }
    }

    value(SuccessiveInteger(this, sign))
  }

  override def printNumber: String = {
    "" + this.sign + this.count
  }
}

