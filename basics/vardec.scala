/*
 * Variable declarations in Scala
 */

object demo {
  def main(args: Array[String]) = {

    // val declarations are immutable, whereas vars are mutable
    val x = 10

    var y = 10
    y = 20 // y is mutable

    println("x: " + x + " y: " + y);

    //Scala is a statically typed language
    // it also has a feature language feature called type inference
    // so we don't need to explicitly define the type
    val z: Int = 10
    val a: Double = 1.0

    println("z: " + z + " a: " + a);
  }
}
