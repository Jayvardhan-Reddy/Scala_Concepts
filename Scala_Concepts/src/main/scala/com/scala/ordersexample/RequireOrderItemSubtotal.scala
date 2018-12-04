package com.scala.ordersexample

object RequireOrderItemSubtotal extends App {

  //val oiRequireConditionNotSatisified = new OrderItem(1,10,5,6,85,86)
  val oiRequireConditionSatisified = new OrderItem(1, 1, 1, 3, 150, 50)
  println(oiRequireConditionSatisified)
}

class OrderItem(
  var orderItemId: Int,
  var orderItemOrderId: Int,
  var orderItemProductId: Int,
  var orderItemQuantity: Int,
  var orderItemSubtotal: Float,
  var orderItemProductPrice: Float) {

  require(orderItemSubtotal == orderItemQuantity * orderItemProductPrice, "Invalid orderItemSubtotal")

  /*To create object with 5 variables, we can create a Constructor. The first line of the constructor is a call to the class default constructor
  Additional constructors can be defined using "this" keyword.*/

  def this(
    orderItemId: Int,
    orderItemOrderId: Int,
    orderItemProductId: Int,
    orderItemQuantity: Int,
    orderItemProductPrice: Float) =
    {
    //Invoke the main constructor
      this(orderItemId, orderItemOrderId, orderItemProductId, orderItemQuantity, orderItemQuantity * orderItemProductPrice, orderItemProductPrice)
    }

  override def toString: String = "OrderItem(" +
    orderItemId +
    "," +
    orderItemOrderId +
    "," +
    orderItemProductId +
    "," +
    orderItemQuantity +
    "," +
    orderItemSubtotal +
    "," +
    orderItemProductPrice +
    ")"
}