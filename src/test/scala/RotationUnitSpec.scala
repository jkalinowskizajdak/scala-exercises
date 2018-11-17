import arrayRotation.ArrayRotation
import org.scalatest._

class RotationUnitSpec extends FlatSpec with Matchers {

  "test array" should "be shifted" in {
    val result = ArrayRotation.roration(Array(1, 2, 3, 4, 5), 1)
    result.last shouldEqual 4
  }

}
