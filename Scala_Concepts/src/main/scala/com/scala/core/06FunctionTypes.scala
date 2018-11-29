import java.util.Date

object FunctionTypes {

  def main(args: Array[String]) {
    //Functions Call-by-Name
    delayed(time());

    //Functions with Named Arguments
    printInt(b = 5, a = 7)

    //Function with Variable Arguments
    printStrings("Hello", "Scala", "Python")

    //Recursion Functions
    for (i <- 1 to 10)
      println( "Factorial of " + i + ": = " + factorial(i) )

    // Default Parameter Values for a Function
    println("Returned Value : " + addInt())

    //Higher-Order Functions
    // These are functions that take other functions as parameters, or whose result is a function.
    println( apply( layout, 10) )

    // Nested Functions
    // Scala allows you to define functions inside a function and functions defined inside other functions are called local functions.
    println( factorial1(2) )
    println( factorial1(3) )

    // Anonymous Functions(with parameters & no parameter)
    var mul = (x: Int, y: Int) => x*y //with parameters
    println(mul(3, 4))
    var userDir = () => { System.getProperty("user.dir") } //no parameter
    println( userDir )

    //Partially Applied Functions
    val date = new Date
    val logWithDateBound = log(date, _ : String)
    logWithDateBound("message1" )
    Thread.sleep(1000)

    //Currying Functions
    //Currying transforms a function that takes multiple parameters into a chain of functions, each taking a single parameter.
    val str1:String = "Hello, "
    val str2:String = "Scala!"
    println( "str1 + str2 = " +  strcat(str1)(str2) )

  }


  //Functions Call-by-Name
  def time() = {
    println("Getting time in nano seconds")
    System.nanoTime
  }
  def delayed( t: => Long ) = {
    println("In delayed method")
    println("Param: " + t)
  }

  //Functions with Named Arguments
  def printInt( a:Int, b:Int ) = {
    println("Value of a : " + a );
    println("Value of b : " + b );
  }

  //Function with Variable Arguments
  def printStrings( args:String* ) = {
    var i : Int = 0;

    for( arg <- args ){
      println("Arg value[" + i + "] = " + arg );
      i = i + 1;
    }
  }

  //Recursion Functions
  def factorial(n: BigInt): BigInt = {
    if (n <= 1)
      1
    else
      n * factorial(n - 1)
  }

  //Default Parameter Values for a Function
  def addInt( a:Int = 5, b:Int = 7 ) : Int = {
    var sum:Int = 0
    sum = a + b

    return sum
  }

  //Higher-Order Functions
  def apply(f: Int => String, v: Int) = f(v)
  def layout[A](x: A) = "[" + x.toString() + "]"

  //Nested Functions
  def factorial1(i: Int): Int = {
    def fact(i: Int, accumulator: Int): Int = {
      if (i <= 1)
        accumulator
      else
        fact(i - 1, i * accumulator)
    }
    fact(i, 1)
  }

  //Partially Applied Functions
  def log(date: Date, message: String) = {
    println(date + "----" + message)
  }

  //Currying Functions
  def strcat(s1: String)(s2: String) = {
    s1 + s2
  }
}
