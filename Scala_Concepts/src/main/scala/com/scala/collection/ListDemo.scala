object ListDemo {


  def main(args: Array[String]): Unit ={

    var a = List("hi", "bye", "cry")
    println(s"The ArrayList value of a is: $a")

    // Alternate way of declaring a List
    /* All lists can be defined using two fundamental building blocks, a tail Nil and ::, which is pronounced cons.
    Nil also represents the empty list.*/
    var b = "knock"::("Knock"::("crap"::("shit" :: Nil)))
    println(raw"The ArrayList value of b is: $b")

    //Concatinate
    var c = List.concat(b,a)
    println(s" The concatinate value is: $c")

    val fruit1 = "apples" :: ("oranges" :: ("pears" :: Nil))
    val fruit2 = "mangoes" :: ("banana" :: Nil)

    //Concatinate - use two or more lists with ::: operator
    var fruit = fruit1 ::: fruit2
    println( "fruit1 ::: fruit2 : " + fruit )

    //Concatinate - use two lists with Set.:::() method
    fruit = fruit1.:::(fruit2)
    println( "fruit1.:::(fruit2) : " + fruit )

    // Creating Uniform Lists
    var sha = List.fill(3)("apple")
    println("The fill keyword of list used to autofill the values: " +sha)

    // Tabulating a Function
   // You can use a function along with List.tabulate() method to apply on all the elements of the list before tabulating the list.

    val squares = List.tabulate(3)(n => n*n)
    println("Square of a number is: " + squares)

    val mul = List.tabulate( 4,5 )( _ * _ )
    println( "mul : " + mul  )

    //Reverse List Order
    val rev = List("do","da","di","da","da")
    println("Reverse of the rev is " +rev.reverse)

    //Filter
    val filt =rev.filter(_ > "da")
    val filt1 = fruit.filter(_.startsWith("p"))
    println(s"filter value is: $filt, \n The next set of val is: $filt1")
  }
}
