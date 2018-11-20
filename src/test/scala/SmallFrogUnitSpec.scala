import missingElement.MissingElement
import org.scalatest.{FlatSpec, Matchers}
import smallFrog.SmallFrog

class SmallFrogUnitSpec extends FlatSpec with Matchers {

  val testX = 10
  val testY = 85
  val testD = 30
  val testResult = 3

  "Min value of jumps" should " be correct" in {
    val result = SmallFrog.minValueOfJump(testX, testY, testD)
    result shouldEqual testResult
  }

}
