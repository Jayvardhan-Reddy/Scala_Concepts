package com.scala.collection

/*Collections in scala are safe due to static type checking*/

object CollectionDemo {

  def main(args: Array[String]) {

    //Range is a type of collection which stores all the numbers in sequence
    // println(1 to 100)

    //Partition: It can be used to segregate the data based on the conditions. i.e here true condition goes to one collection(even) and false to other
    val (even, odd) = (1 to 100).partition(_ % 2 == 0)
    println(even)
    println(odd)

  }

}