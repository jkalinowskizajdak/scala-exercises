import arrayRotation.ArrayRotation
import oddNumber.OddNumber

object  Main {

  def main(args: Array[String]) {

    println("Hello World!")
    val result = ArrayRotation.roration(Array(1, 2, 3, 4, 5), 2)
    for ( a <- result) {
      println(a)
    }

    println(OddNumber.oddNumber(Array(1, 2, 1, 3, 4, 4 , 5, 6,2, 7, 5, 6, 7)))
  }

}
