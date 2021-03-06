package com.scala.core

/*
1. If both class name and the Object name are same then it is known as companian object
2. By using companian object we can access private methods in the class
3. Companian object does not take any arguments.
4. A companion object differs from other objects as it has access rights to the class/trait that other objects do not
5. Companion object can access private methods and attributes
*/

object CompanionObject extends App {

  // apply is a special method as part of companian objects & as part of this prog, we are returning object3.

  def apply(orderId: Int, orderDate: String, orderCustomerId: Int, orderStatus: String): CompanionObject = {
    // Here we are creating instance for the CompanionObject class below

    new CompanionObject(orderId, orderDate, orderCustomerId, orderStatus)
  }

  //If we want to create a immutable Order object , we can create 2 ways

  // i) Here we are instantiating object w.r.t class CompanionObject

  val companionObjectUsingCompanionClass = new CompanionObject(1, "2013-10-01 00:00:00.000", 100, "UsingCompanionClass")
  println(companionObjectUsingCompanionClass)

  // ii) Here we are instantiating object w.r.t object CompanionObject i.e using Singleton class

  val companionObjectUsingSingletonObject = CompanionObject.apply(1, "2013-10-01 00:00:00.000", 100, "UsingSingletonObject")
  println(companionObjectUsingSingletonObject)
  println(A.a)
}

class CompanionObject(var orderId: Int, var orderDate: String, var orderCustomerId: Int, var orderStatus: String) {

  println("I am inside CompanionObject Constructor")
  override def toString = "CompanionObject(" + orderId + "," + orderDate + "," + orderCustomerId + "," + orderStatus + ")"

}

//Companion class to access private variable
class A(private val msg: String)
object A {
  val a = new A("<-----------Private class A variable accesed from object A------------->")
  println(a.msg)
}

// Cannot Access class A variable msg since it is not companion class
/*object  B{
  val a = new A("<-----------Private class A variable accesed from object A------------->")
  println(a.msg)  // value msg in class A cannot be accessed in com.scala.core.A
}*/