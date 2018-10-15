class ch10_2 {
  def optionMonoid[A]: Monoid[Option[A]] = new Monoid[Option[A]] {
    override def op(a1: Option[A], a2: Option[A]): Option[A] = a1 orElse a2
    override def zero: Option[A] = None
  }

  def dual[A](m: Monoid[A]) = new Monoid[A] {
    override def op(a1: A, a2: A): A = m.op(a2, a1)
    override def zero: A = m.zero
  }

  def firstOptionMonoid[A] = optionMonoid[A]
  def lastOptionMonoid[A] = dual(firstOptionMonoid[A])
}
