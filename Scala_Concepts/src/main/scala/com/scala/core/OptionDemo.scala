package com.scala.core

/*Scala Option[ T ] is a container for zero or one element of a given type. An Option[T] can be either Some[T] or None object,
which represents a missing value. For instance, the get method of Scala's Map produces Some(value) if a value corresponding 
to a given key has been found, or None if the given key is not defined in the Map.

Option type is used frequently in Scala programs and you can compare this with the null value available in Java which indicate no value.*/ 

object OptionDemo extends App{
  val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")
      
      println("show(capitals.get( \"Japan\")) : " + show(capitals.get( "Japan")) )
      println("show(capitals.get( \"India\")) : " + show(capitals.get( "India")) )
      
      def show(x: Option[String]) = x match {
      case Some(s) => s
      case None => "?"
   }
}