object Operator {

  def main(args: Array[String]) {
    // Operands
    var a = 10;
    var b = 4;
    var c = true;
    var d = false;
    var result = 0;

    // using arithmetic operators
    println("Addition is: " + (a + b));
    println("Subtraction is: " + (a - b));

    // using Relational Operator:
    if (a == b) {
      println("Equal To Operator is True");
    } else {
      println("Equal To Operator is False");
    }

    // using Logical Operator ‘oR"
    println("Logical OR of a || b= " + (c || d));

    // using Bitwise AND Operator
    result = a & b;
    println("Bitwise AND: " + result);

    // using Assignment Operators
    a += b
    println("Addition Assignment Operator: " + a);

  }
}
