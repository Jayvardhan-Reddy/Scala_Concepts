package com.scala.core

object EqualityObjectComparision extends App {
  
// To check Equality of references ( pointer to the same object. or java equivalent of ==), use eq

  val a = "abcd"
  val b = new String("abcd")
  println(a eq b)
//  O/P: Boolean = false

}