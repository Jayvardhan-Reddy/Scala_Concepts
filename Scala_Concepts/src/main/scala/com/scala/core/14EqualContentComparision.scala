package com.scala.core

object EqualContentComparision extends App {
  
// In scala both Equals & == compare the content
  
  println(1 == 2)
  //O/P: Boolean = false
  
  println("abcd" == "abcd")
  //O/P: Boolean = true
  
  println("abcd".equals("abcd"))
  //O/P: Boolean = true
}