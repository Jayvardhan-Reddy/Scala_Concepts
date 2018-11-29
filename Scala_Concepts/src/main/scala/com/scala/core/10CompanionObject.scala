package com.scala.core

/*
1. If both class name and the Object name are same then it is known as companian object
2. By using companian object we can access private methods in the class
3. Companian object does not take any arguments.
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
}

class CompanionObject(var orderId: Int, var orderDate: String, var orderCustomerId: Int, var orderStatus: String) {
  
  println("I am inside CompanionObject Constructor")
  override def toString = "CompanionObject(" + orderId + "," + orderDate + "," + orderCustomerId + "," + orderStatus + " )"
  
}