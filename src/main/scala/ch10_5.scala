object ch10_5 {
  def foldMap[A, B](as: List[A], m: Monoid[B])(f: A => B): B = {
    //(as map f).foldRight(m.zero)(m.op)
    as.foldLeft(m.zero)((b, a) => m.op(b, f(a)))
  }
}
