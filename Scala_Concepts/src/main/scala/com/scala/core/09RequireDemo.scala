package com.scala.core

/*All the counter parts to java primitive types in scala are called as Value classes because they behave like primitives Whenever they should behave
like integer with I capital float with F capital etc. to act as class variables*/


object RequireDemo extends App {
  
//  val dogObjFailConfition = new Dog(2)  // Exception in thread "main" java.lang.IllegalArgumentException: requirement failed: The number of legs are invalid
  val dogObjPassCondition = new Dog(20)
}

// require is a pre-condition that should be met
// require means that the user is at fault

class Dog(legs: Int){
  require(legs>2, "The number of legs are invalid") // Will throw an exception if the condition is false
  println("condition passed")
}