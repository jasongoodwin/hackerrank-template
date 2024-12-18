package example

class SolutionSpec extends munit.FunSuite {
  test("it should deal with unexpected input") {
    assertEquals(Result.solveMe(0), "")
  }

  test("given example input, it should return the correct output") {
    assertEquals(Result.solveMe(1), "1")
  }
}
