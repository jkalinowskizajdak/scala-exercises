import countDiv.CountDiv
import org.scalatest.{FlatSpec, Matchers}

class CountDivUnitSpec extends FlatSpec with Matchers {

  val testA = 6
  val testB = 11
  val testK = 2
  val testResult = 3

  "Count div " should " be correct " in {
    val result = CountDiv.countDiv(testA, testB, testK)
    result shouldEqual testResult
  }

}
