package com.scala.core;
object Order extends App {
  
  val order = new Order(1, "2013-10-01 00:00:00.000", 100, "COMPLETE")
/*  val orderString = new OrderString(1, "2013-10-01 00:00:00.000", 100, "COMPLETE")
  println(orderString)*/
  
}


class Order(orderId: Int, orderDate: String, orderCustomerId: Int, orderStatus: String)
      {
          println("I am inside Order Constructor")
           /* val orderString = new OrderString(1, "2013-10-01 00:00:00.000", 100, "COMPLETE")
                println( orderString + "In Order class")*/
      }

//  -------------To create function as part of the class ------------------
class OrderString(orderId: Int, orderDate: String, orderCustomerId: Int, orderStatus: String)
      {
          println("I am inside OrderString Constructor")
          override def toString = "Order(" + orderId + "," + orderDate + "," + orderCustomerId + "," + orderStatus + " )"
      }