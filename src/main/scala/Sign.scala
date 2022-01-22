sealed trait Sign {
  def negate: Sign
}

case object Positive extends Sign {
  override def negate: Sign = Negative

  override def toString: String = "+"
}

case object Negative extends Sign {
  override def negate: Sign = Positive

  override def toString: String = "-"
}
