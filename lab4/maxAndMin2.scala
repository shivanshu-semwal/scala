object MaxMin {
  def main(args: Array[String]) {
    println("Max and min from 20, 15 is ")
    maxAndMin(20, 15)
  }

  def maxAndMin(a: Int, b: Int) = {
    def findMax() = {
      def maxValue() = {
        if (a > b)
          println("Max is: " + a)
        else
          println("Max is: " + b)
      }
      maxValue()
    }
    def findMin() = {
      def minValue() = {
        if (a < b)
          println("Min is: " + a)
        else
          println("Min is: " + b)
      }
      minValue()
    }
    findMin();
    findMin();
  }
}
