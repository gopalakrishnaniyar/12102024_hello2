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

  def sum(a: Int, b: Int): Int = a + b
  def concatenate(s1: String, s2: String): String = s1 + s2

  val x = sum(1,2)
  println(x)

  val y = concatenate("1","2")
  println(y)

  def defParamMethod(x:Int,y:Int=100):
  Unit = {println(x+y)}

  defParamMethod(100)
  defParamMethod(100,300)

  def engage(bool1:Boolean,bool2:Boolean):
    Unit  ={ println(" Boolean 1 is : " + bool1 + " Boolean 2 is : " + bool2) }

  engage(bool1 = true, bool2 = false)

}

