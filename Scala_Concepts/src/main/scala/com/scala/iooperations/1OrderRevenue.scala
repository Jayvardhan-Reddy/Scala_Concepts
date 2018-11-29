package com.scala.iooperations
import scala.io.Source

// Problem Statement: By passing orderId we have to get the order items subtotal and compute revenue using Map and Reduce functions

object OrderRevenue extends App {

  // To read a file
    val orderItems = Source.fromFile("C:/Users/Jay/eclipse-workspace/scala_programs/Scala_Concepts/resources/retail_db/order_items/part-00000").getLines.toList
    val orderRevenue = orderItems.
      filter(oi => oi.split(",")(1).toInt == 2).
      map(oi => oi.split(",")(4).toFloat).
      reduce((t, v) => t + v)
    println(orderRevenue)
  

}