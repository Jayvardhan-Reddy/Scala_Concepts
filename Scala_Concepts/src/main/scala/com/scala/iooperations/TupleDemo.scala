package com.scala.iooperations
import scala.io.Source

object TupleDemo extends App {

  var orderItems = Source.fromFile("C:/Users/Jay/eclipse-workspace/scala_programs/Scala_Concepts/resources/retail_db/order_items/part-00000").getLines.toList
  println("Data as in the Input file:")
  orderItems.take(5).foreach(println)

  println("\n" + "Data in tuple format:")
  val tupleMap = orderItems.map(rec => (rec.split(",")(0), rec.split(",")(2), rec.split(",")(4)))
  tupleMap.take(5).foreach(println)
}