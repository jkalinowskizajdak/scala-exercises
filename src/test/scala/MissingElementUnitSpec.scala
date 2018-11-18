import missingElement.MissingElement
import org.scalatest.{FlatSpec, Matchers}

class MissingElementUnitSpec extends FlatSpec with Matchers {

  val testRange = Array(2, 3, 1, 5)
  val testResult = 4

  "Missing element" should " be correct" in {
    val result = MissingElement.missingElement(testRange)
    result shouldEqual testResult
  }

}
