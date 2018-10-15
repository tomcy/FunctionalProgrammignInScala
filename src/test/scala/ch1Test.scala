import org.scalatest.FunSuite

class ch1Test extends FunSuite {

  test("testTestPrint") {
    val tester = new ch1()
    tester.testPrint("just a test.")
    assert(1 == 1)
  }

}
