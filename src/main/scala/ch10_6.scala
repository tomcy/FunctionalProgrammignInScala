object ch10_6 {
  def foldRight[A, B](z: B)(op: (B, A) => B): B = ???

  // you can image B is B => B in foldMap
  // so the result after foldMap is B => B which needs to take B to get B as out correct output
  def foldRight2[A, B](as: List[A])(z: B)(f: (A, B) => B): B =
    ch10_5.foldMap(as, ch10_3.endoMonoid[B])(f.curried)(z)
}
