import oddNumber.OddNumber
import org.scalatest.{FlatSpec, Matchers}

class OddNumberUnitSpec extends FlatSpec with Matchers {

  "solution result" should "correct" in {
    val result = OddNumber.oddNumber(Array(1, 2, 1, 3, 2, 4, 4 , 5, 6, 7, 5, 6, 7))
    result shouldEqual 3
  }

}
