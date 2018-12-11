package com.scala.core

object StringInterpolation extends App {

    //‘s’ String Interpolator
    //The literal ‘s’ allows the usage of variable directly in processing a string, when you prepend ‘s’ to it

    val name = "James"

    println(s"Hello, $name")
    println(s"1 + 1 = ${1 + 1}")
  

  //‘ f ’ Interpolator
  /*The literal ‘f’ interpolator allows to create a formatted String, similar to printf in C language.
  printf style format specifiers such as %d, %i, %f, etc*/

  val height = 1.9d
  val name1 = "James"
  println(f"$name1%s is $height%2.2f meters tall")

  //‘raw’ Interpolator
      println(raw"Result = \n a \n b")

  //‘s’ String Interpolator
    println(s"Result = \n a \n b")
  
}
