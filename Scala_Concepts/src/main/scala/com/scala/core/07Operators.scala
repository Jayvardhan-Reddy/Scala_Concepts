package com.scala.core

object Operators extends App {
  val f = new Fraction(2, 4)
  println(f)
  println(f.result)
  val s = new Fraction(5, 3)
  println(s)
  println(s.result)
  val r = f + s
  println(r)
  println(r.result)
  
  println("Subtraction 2 fractions")
  val subr = f - s
  println(subr)
  println(subr.result)
}

class Fraction(val n: Int, val d: Int) {
  override def toString = n + "/" + d
  def result = n / d.toDouble
  def +(f: Fraction) = {
    new Fraction(((n * f.d) + (f.n * d)), (d * f.d))  //f.d = 3 , f.n = 5; d= 4, n = 2
  }
  
  //	f – s = ((n1 * d2) – (n2 * d1)), (d1 * d2)
  
  def -(f: Fraction) = {
    new Fraction( 
        ((n*f.d) - (f.n* d)), (d*f.d)
        )
  }
  
}
