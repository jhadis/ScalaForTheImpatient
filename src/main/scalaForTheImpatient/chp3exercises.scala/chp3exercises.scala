package main.scalaForTheImpatient.chp3exercises.scala

import scala.collection.immutable.StringOps

/**
 * Created by admin on 4/2/17.
 */
class chp3exercises {

}

object chp3exercises {

  val theArray = Array[Int](1,2,3,4,5,6,7)

  def traverseSkippingSteps() = {
    for ( i <- 0.until(theArray.length, 2) ) {
      println(i)
    }
  }

  def traverseArray() = {
    for (elem <- theArray) {
      println(elem)
    }
  }

  def traverseInReverseOrder() = {
    for (elem <- (0 until theArray.length+1).reverse) {
      println(elem)
    }
  }

  def main(args: Array[String]): Unit = {
    traverseSkippingSteps()
    println("Traverse using shortcut")
    traverseArray()
    println("Traverse in reverse order")
    traverseInReverseOrder()
//    println(signum(3))
//    println(signum(-2))
//    println(signum(0))
//    advancedForLoop

  }
}
