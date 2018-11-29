import org.scalatest.{FlatSpec, Matchers}
import permutation.Permutation

class PermutationUnitSpec extends FlatSpec with Matchers {

  val permutationArray = Array(4, 1, 3, 2)
  val noPermutationArray = Array(4 , 1, 3)
  val doubleArray = Array(1, 1)

  "Permutation" should "be 1" in {
    val result = Permutation.permutation(permutationArray)
    result shouldEqual 1
  }

  "Permutation" should "be 0" in {
    val result = Permutation.permutation(noPermutationArray)
    result shouldEqual 0
  }

  "Duplicate" should "be 0" in {
    val result = Permutation.permutation(doubleArray)
    result shouldEqual 0
  }

}
