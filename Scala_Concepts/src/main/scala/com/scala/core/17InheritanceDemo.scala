package com.scala.core

class Point( val x: Int , val y: Int) {
 protected var a = x
  protected var b = y

  def axis( c: Int,  d: Int) {
    val e = a+b+c+d
    println("value is " + e)
  }

}

class Location(override val x: Int, override val y: Int, val z: Int) extends Point(x,y) {
  var g = z
  // var a = x
   //var b = y
  def axis( c: Int,  d: Int, e: Int) {
    val e = a+b+c+d+g
    println("value is " + e)
  }

}

object InheritanceDemo {

  def main(args: Array[String]): Unit ={
    val shit = new Point(40,50)
    val shit1 = new Location(30,45,56)
    shit.axis(10,20)
    shit1.axis(10,20,30)

  }
}
