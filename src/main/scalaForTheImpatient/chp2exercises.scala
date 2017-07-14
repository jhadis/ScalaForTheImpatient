package main.scalaForTheImpatient

/**
 * Created by admin on 4/2/17.
 */
class chp2exercises {

}

object chp2exercises {
  def signum(theNumber: Int): Int = {
    if (theNumber > 0)
      return 1
    else if (theNumber < 0)
      return -1
    else return 0
  }

  //Scala equivalent of this Java loop: for (int i = 10; i >= 0; i--) System.out.println(i);
  def advancedForLoop = {
    for (i <- 0 to 10) {
      println(10 - i)
    }
  }

  def countdown(startNum: Int) = {
    for (i <- 0 to startNum) {
      println(startNum - i)
    }
  }

  def stringAnalyzer(inputString: String) = {
    var product: Int = 1;
    for (ch <- inputString) {
      product *= ch
    }
    println(product)
  }

  def product(inputString: String) = {
    println(inputString.map(_.toInt).product)
  }

//  var inputString: String = ???
//  var theProduct: Int = ???

  def recursiveProduct(inputString: String, theProduct: Int): Int = {
//    println(inputString.map(_.toInt).product)
    if (inputString.isEmpty)
      return theProduct
    else {
      val newString = inputString.takeRight(inputString.length - 1)
      val newProduct = theProduct * inputString.charAt(0)
      return recursiveProduct(newString, newProduct)
    }
  }

  def computeExponent_exercise10(num: Int, exp: Int ): Unit  = {
    val result = Math.pow(num.toDouble, exp.toDouble)
    println(result)
  }

  def main(args: Array[String]): Unit = {
//    println(signum(3))
//    println(signum(-2))
//    println(signum(0))
//    advancedForLoop
    countdown(5)
    stringAnalyzer("Hello")
    product("Hello")
    println(recursiveProduct("Hello", 1))
    computeExponent_exercise10(2,3)
  }
}
