package com.scala.core

object SyntacticSugar extends App {
  val l = List(new Cat, new Dog1) 
  print(l)
}

// Parent of all Object is Any
// Parent of collection is Traversable
// Each collection has a companian object with apply method

class Animal

class Dog1 extends Animal

class Cat extends Animal


//O/P: List[Animal] = List(Cat@57d7s, Dog@34gf23f)