package com.scala.advance

/* In scala, when we do 1 to 10, It returns a range from 1 to 10. This is an example of implicit type conversion, here "to" method is part
 *  of RichInt class. Scala compiler converts Int to RichInt to get method definition of "to"
 * 
*/

object ImplicitsDemo extends App {
  implicit
  val a = 0 to 10
  println(a)
}