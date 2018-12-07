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

//------------------------------------------------Classes and function with Implicit----------------------------------------------------
//  https://docs.scala-lang.org/tour/implicit-parameters.html

abstract class Monoid[A] {
  def add(x: A, y: A): A
  def unit: A
}

object ImplicitTest {
  implicit val stringMonoid: Monoid[String] = new Monoid[String] {
    def add(x: String, y: String): String = x concat y
    def unit: String = ""
  }
  
  implicit val intMonoid: Monoid[Int] = new Monoid[Int] {
    def add(x: Int, y: Int): Int = x + y
    def unit: Int = 0
  }
  
  def sum[A](xs: List[A])(implicit m: Monoid[A]): A =
    if (xs.isEmpty) m.unit
    else m.add(xs.head, sum(xs.tail))
    
  def main(args: Array[String]): Unit = {
    println(sum(List(1, 2, 3)))       // uses IntMonoid implicitly
    println(sum(List("a", "b", "c"))) // uses StringMonoid implicitly
  }
}