package com.scala.ordersexample

// Even though we don't specify var or val in the case class arguments by default it considers it as val and not constructor argument
case class CaseOrderItem ( orderItemId: Int,
   orderItemOrderId: Int,
   orderItemProductId: Int,
   orderItemQuantity: Int,
   orderItemSubtotal: Float,
   orderItemProductPrice: Float) {
  println("Inside case class")
}

object CaseOrderItem {
  
  def main(args: Array[String]){
    def apply {
    var a =  new CaseOrderItem(1,2,3,4,5,7)
    println(a.orderItemId)  
    a.productArity
    a.productElement(0)
  }
  
  }
}
