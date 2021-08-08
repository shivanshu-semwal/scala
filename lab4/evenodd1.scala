object evenodd {
  def main(args: Array[String]) = {
    println("No 21 is: ")
    evenOdd(21)
  }

  def evenOdd(a: Int) = {
    def isEven() = {
      if (a % 2 == 0) println("Even")
    }
    def isOdd() = {
      if (a % 2 != 0) println("Odd")
    }

    isEven()
    isOdd()
  }
}
