package com.scala.core

object ClassVariableTypes extends App {

  var orderImmutable = new OrderImmutable(1, "2013-10-01 00:00:00.000", 100, "COMPLETE")
  println(orderImmutable)
  var orderMutable = new OrderMutable(1, "2013-10-01 00:00:00.000", 100, "COMPLETE")
  println(orderMutable)
}

//--------------------To define Class level variable (immutable parameters)------------------

// We have to use val and when we declare val it acts like final variable of Java

class OrderImmutable(val orderId: Int, val orderDate: String, val orderCustomerId: Int, val orderStatus: String) {
  val stat = 10
  println("I am inside OrderImmutable Constructor")
  override def toString = "OrderImmutable(" + orderId + "," + orderDate + "," + orderCustomerId + "," + orderStatus + " )"
}

//--------------------To define Class level variable with mutable parameters------------------

// We have to use Var

class OrderMutable(var orderId: Int, var orderDate: String, var orderCustomerId: Int, var orderStatus: String) {
  val stat = 11
  println("\n" + "I am inside OrderMutable Constructor")
  override def toString = "OrderMutable(" + orderId + "," + orderDate + "," + orderCustomerId + "," + orderStatus + " )"
}

class BlockVariables {

  val i = 40
  def block1 {
    val i = 10
    //  val i = 20  // Error i is already defined as value i
  }

  def block2 {
    val i = 30
  }

}