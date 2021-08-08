object evenodd {
  def main(args: Array[String]) = {
    println("no 22 is: ")
    evenOdd(22)
  }

  def evenOdd(a: Int) = {
    def even() = {
      def checkEven() = {
        if (a % 2 == 0) println("Even")
      }
      checkEven()
    }
    def odd() = {
      def checkOdd() = {
        if (a % 2 != 0) println("Odd")
      }
      checkOdd()
    }
    even()
    odd()
  }
}
