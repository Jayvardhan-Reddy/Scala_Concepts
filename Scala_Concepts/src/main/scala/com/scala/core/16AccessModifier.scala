package com.scala.core

//Scala fields and methods are public by Default
//Scala lets you control method visibility in a more granular and powerful way
//Scopes possible are
/*i) 		public
  ii) 	private
  iii) 	object-private Scope
  iv)		package
  v) 		package-specific*/

object AccessModifier extends App {
  
}



class Hi{
  private val msg = "Hi"
  def same(other:Hi) = msg == other.msg
}

//msg is private to this class

class Hi2 {
  protected val msg = "Hi"
}
// The protected field msg can be accessed either from Hi2 or its subclass

//You can limit Scope of access

/*package somepackage
class Hi {
  private[somepackage] val msg = "Hi"
}*/

 //Also for "this" object

class Hi3{
  private[this] val msg = "Hi"

  //def same(other:Hi) = msg == other.msg
}