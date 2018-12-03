import earliestTime.EarliestTime
import org.scalatest.{FlatSpec, Matchers}

class EarliestTimeUnitSpec extends FlatSpec with Matchers {

  val testResult = 6
  val testArray = Array(1, 3, 1, 4, 2, 3, 5, 4)
  val testX = 5

  "Earliest Time" should " be correct" in {
    val result = EarliestTime.earliestTime(testX, testArray)
    result shouldEqual testResult
  }

}
