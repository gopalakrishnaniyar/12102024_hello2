package org.domainModelling.com

trait authenticate:
  def methodOne(): String // has no body, so it’s abstract
  def methodTwo():
  Unit = {
    println("I am in method 2")
  }

class myClass() extends authenticate:
  def methodOne(): String = "Woof!"
  override def methodTwo(): Unit = {
    println("overriding method 2")
  }

class myClass2(a: String, b: String):

  var a1 = "string32"

  def myMethod():
  Unit = { println(s"values are: $a and $b and $a1") }


@main
def main(): Unit = {
  //println("Hello world!")
  var a = new myClass()
  print("\n" + a.methodOne() +  "\n")
  a.methodTwo()

  // instantiate class myclass2 an access method and direct class variable.
  var obj = myClass2("zun "," zoo")
  obj.myMethod()

  // object classes are now mutable
  obj.a1  = "string 45"
  println (obj.a1)

  // enumeration with case types
  enum pizzaSize:
    case small, medium, large

  var enumUse:pizzaSize = pizzaSize.large

  enumUse match
    case pizzaSize.medium => println("medium")
    case _ => println("var is not assigned for a enum case")
}

