package com.scala.core

/*An extractor in Scala is an object that has a method called unapply as one of its members. 
The purpose of that unapply method is to match a value and take it apart. Often, the extractor object 
also defines a dual method apply for building values, but this is not required*/

object Extractors {
  def main(args: Array[String]) {
    println("Apply method : " + apply("Zara", "gmail.com"));
    println("Unapply method : " + unapply("Zara@gmail.com"));
    println("Unapply method : " + unapply("Zara Ali"));
  }

  // The injection method (optional)
  def apply(user: String, domain: String) = {
    user + "@" + domain
  }

  // The extraction method (mandatory)
  def unapply(str: String): Option[(String, String)] = {
    val parts = str split "@"

    if (parts.length == 2) {
      Some(parts(0), parts(1))
    } else {
      None
    }
  }
}