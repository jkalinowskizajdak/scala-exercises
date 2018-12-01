import org.scalatest.{FlatSpec, Matchers}
import smallestPositive.SmallestPositive

class SmallestPositiveUnitSpec extends FlatSpec with Matchers {

  val array1 = Array(1, 3, 6, 4, 1, 2)
  val result1 = 5
  val array2 = Array(1, 2, 3)
  val result2 = 4
  val array3 = Array(-2, -1)
  val result3 = 1
  val array4 = Array(4, 2, 3)
  val result4 = 1

  "smallest positive" should "be correct" in {
    val r1 = SmallestPositive.smallestPositive(array1)
    val r2 = SmallestPositive.smallestPositive(array2)
    val r3 = SmallestPositive.smallestPositive(array3)
    val r4 = SmallestPositive.smallestPositive(array4)
    r1 shouldEqual result1
    r2 shouldEqual result2
    r3 shouldEqual result3
    r4 shouldEqual result4
  }

}
