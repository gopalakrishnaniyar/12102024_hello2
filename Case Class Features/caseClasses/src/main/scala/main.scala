package org.caseClass.com

class normalClass(val x:String)
{
  var temp1 = "strng43"
}

//immutable vars in case class. we do not get to create vars inside a case class.
case class caseClass(x:String)

@main
def main(): Unit = {

  val obj1 = new normalClass("normal. class")
  val obj2 = caseClass("inside case class.")

  println(obj1.x + obj1.temp1)
  println(obj2.x)

  val valObj = obj2.copy(x = "lol")
  println(valObj.toString)


  var myList = List(1,2,3,4)
  for (item <- myList) do println(item)
  val newList = for (item <- myList) yield item+2
  println(newList)
}

