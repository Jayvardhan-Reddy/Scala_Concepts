/*import scala.io.Source

object AggreagteByKeyDemo {

  def main(args: Array[String]): Unit = {

    val orderItems = Source.fromFile("/Scala_Concepts/resources/retail_db/order_items/part-00000").getLines().toList
    //Get revenue per order_id
    val orderItemsMap = orderItems.map(ele => {
      (ele.split(",")(1).toInt,ele.split(",")(4).toFloat)
    })

    //Input data is (order_id,order_item_subtotal)

    val revenueAndMaxPerProductId = orderItemsMap.
      aggregatByKey((0.0f, 0.0f))(
        (inter, subtotal) => (inter._1 + subtotal, if(subtotal > intern._2) subtotal else inter._2),
        (total, inter) => (total._1 + inter._1, if(total._2 > inter._2) total._2 else inter._2)
      )

  }
}
*/