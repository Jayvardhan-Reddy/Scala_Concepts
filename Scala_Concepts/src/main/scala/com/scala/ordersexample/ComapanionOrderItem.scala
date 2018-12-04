package com.scala.ordersexample

object ComapanionOrderItem {
  
  def main(args: Array[String]){
    val a = ComapanionOrderItem.apply(10)
    println(a)
    println(a.i)
    //println(a)
  }
  
  def apply(i: Int) = {        // Here = is important, if = is not used then it will return Unit as output.
    new ComapanionOrderItem(i)
  }
}

class ComapanionOrderItem(val i: Int)