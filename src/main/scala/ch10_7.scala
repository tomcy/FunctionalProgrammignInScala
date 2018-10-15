object ch10_7 {
  def foldMapV[A, B](v: IndexedSeq[A], m: Monoid[B])(f: A => B): B = {
    v.size match {
      case 0 => m.zero
      case 1 => f(v.head)
      case s =>
        v.splitAt(s / 2) match {
          case (a, b) => m.op(foldMapV(a, m)(f), foldMapV(b, m)(f))
        }
    }
  }
}
