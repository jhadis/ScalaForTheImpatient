package main.scalaForTheImpatient

/**
 * Created by admin on 3/30/17.
 */
object chp1exercises {

  import math.BigInt
  import scala.util.Random

  /**
   * Create a random directory name by generating a random BigInt and then converting
   * to String by using base36 conversion
   */

  def makeDirectoryName: String = {

    val rand = BigInt.int2bigInt(Random.nextInt)
    rand.toString(36)

  }

    def main(args: Array[String]): Unit = {
      println(makeDirectoryName)
    }

}
