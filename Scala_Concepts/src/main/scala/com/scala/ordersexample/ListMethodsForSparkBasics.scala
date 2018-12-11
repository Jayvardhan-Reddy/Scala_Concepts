class ListMethodsForSparkBasics {

}

object ListMethodsForSparkBasics {

  def main(args: Array[String]): Unit =
    {
      println("working")

      // Filtering
      var dummyList = List(8, 6, 3, 4, 1, 6, 7, 2, 5)
      println(s" The List values are: =  $dummyList ")
      val filteredList = dummyList.filter(_ > 3)
      println(s" The filtered values are: =  $filteredList ")
      //Applying sort for filter
      val filteredListSorted = dummyList.filter(_ % 2 == 0).sorted
    }
}
