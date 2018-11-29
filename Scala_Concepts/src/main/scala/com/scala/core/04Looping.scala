import java.util

object Looping {

  def main(args: Array[String]): Unit ={
    var a = 10
    var i =0
    println("while loop")
    while(a<20){
      print(a + " ")
      a+=1
    }
    println(
      """
        |Do while loop """.stripMargin)
    do{
      print(i + " ")
      i= i+1
    }
    while(i<10)

    println(
      """
        |For loop""".stripMargin)
    for( a <- 1 to 10){
      print( a + " " );
    }

    println(
      """
        |Collection For loop""".stripMargin)

    var trailList = List(10,20,30,40,50)
    for(a <- trailList if(a != 30))
      print(a + " ")

    println(
      """
        |Yeild For loop""".stripMargin)

    val numList = List(1,2,3,4,5,6,7,8,9,10);

    // for loop execution with a yield
    var retVal = for{ a <- numList if a != 3; if a < 8 }yield a

    // Now print returned values using another loop.
    for( a <- retVal){
      print(  a + " ");
    }

  }
}
