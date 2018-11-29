package com.scala.core

object ConstructorWithAurguments extends App {

  val obj = new DemoConstructor()
  val obj1 = new DemoConstructor("yeah")
}

class DemoConstructor(val name: String, val legs: Int){
  def this(name: String) = this(name,5)
  def this() = {
    this("animal",4)
    println("Inside no constructor")
  }
  println("Inside class statement")
}