package com.scala.core

object ProgrammingConstructs extends App {

  val i = (math.random * 100).toInt
  val j = (math.random * 100).toInt

    println("\n" +"If condition:")
  //if condition
  if (i > j) {
    println(i)
  } 
  else if (i == j) {
    println("equal")
  } 
  else
    println(j)
  
    println("\n" + "While loop:")
    val x = 50
    val y = 80
 // While loop i to j in decending order
    var ctr = y
    while(ctr >= x)
    {
      println(ctr)
      ctr -=  1
    }
  println("\n" +"For loop increment:")
  // For loop increment
  for(e <- x to y by 2)
    println(e)
   
      println("\n" +"For loop decrement:")
  // For loop decrement
    for(e <- y to x by -3)
      println(e)
}
