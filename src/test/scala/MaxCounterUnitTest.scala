import maxCounter.MaxCounter
import org.scalatest.{FlatSpec, Matchers}

class MaxCounterUnitTest extends FlatSpec with Matchers {

  val testArray = Array(3, 4, 4, 6, 1, 4, 4)
  val testN = 5
  val testResult = Array(3, 2, 2, 4, 2)

  "Max counter" should " be correct" in {
    val result = MaxCounter.maxCounter(testN, testArray)
    result shouldEqual testResult
  }
}
