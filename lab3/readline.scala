object readLineDemo{
  def main(args: Array[String]){
    // loop
    while(true){
      // read the line
      val result = scala.io.StdIn.readLine()

      // display the string
      printf("You entered: %s", result)

      // newline
      println()
    }
  }
}