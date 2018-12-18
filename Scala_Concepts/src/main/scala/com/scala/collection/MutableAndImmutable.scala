package com.scala.collection

object MutableAndImmutable extends App {

  // Array is of type Mutable collection and update method is available
  val a = Array(1, 5, 4)
  a.update(2, 25)
  println(a)
  // a = a:+ = 5  // Throws error since a is of type val
  var b = Array(11, 51, 10)
  b.update(1, 28)
  println(b)
  b = b :+ 97 // We can add new elements since b is type var
  b(2) = 89
  println(b)

  // List is of type Immutable collection and as part of this update method is not available
  val c = List(1, 2, 3)
  //  c.update(0, 123)  //  Update is not a function in List
  c.updated(2, 85)
  println(c)
  var d = List(15, 56, 63)
  d.updated(1, 25)
  println(d)
  d = d :+ 505
  println(d)
 // d(1) = 29  // Since update is not part of List
}