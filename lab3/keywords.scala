// object keyword
object keywordsDemo {
  // def keyword
  def main(array: Array[String]) {
    // var keyword
    var x = 10;
    // val keyword
    val y = 20;

    // true flag
    var flag: Boolean = true
    // false flag
    var flag2: Boolean = false

    // if keyword
    if (x % 2 == 0) print("x is even\n")
    // else keyword
    else print("x is odd")

    // for keyword
    // <- keyword
    for (x <- 0 to 4) {
      println(x)
    }

    // do keyword
    do {
      println(x)
      x = x + 1
    } while (x < 10)
    // while keyword

    // new keyword
    val pt = new Point(10, 20);

    // Move to a new location
    pt.move(10, 10);
  }

  def concat(a: Integer, b: Integer): String = {

    // try keyword
    try {
      // return keyword
      var c = a.toString() + b.toString()
      return c
    } catch {
      // catch keyword
      case _: Throwable => print("some exception occurred")
    } finally {
      // finally keyword
      print("no exception occurred")
    }
    return "NULL"
  }
}

// class keyword
class Point(val xc: Int, val yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy

    // this keyword
    println("Point x location : " + this.x);
    println("Point y location : " + y);
  }
}
