import scala.io.StdIn.readLine
import java.io.IOException  // Import IOException
import scala.util.control.Breaks._


@main
def execute():
Unit = {

  val firstName = "John"
  val mi = 'C'
  val lastName = "Doe"
  println(s"Full Name is : $firstName $mi $lastName")
  val quote ="The essence of Scala: Fusion of functional and object-oriented programming in a typed setting."
    println(quote)
  println(s"$mi$lastName")

  val myList = List(1,2,3,4,5)
  println(myList.size < 6)

  val temper = 399834.00923
  println(temper)

  val voyagerDistance = BigDecimal(23234534545.3434)
  println("voyager distance is " + voyagerDistance)

  // Binding 2 variables irrespective of type
  var voyager1 = 3343.23
  var voyager2 = 100.00
  println(s" type all that i want because the next dollar concatenates ${voyager1 + voyager2}")
 // Automatic type inference - wonderful.. but complexity increases..
  var binary = if voyager1 + voyager2 > 3500 then "sd" else false
  println(binary)

  val binary32 = if voyager1 < voyager2 then "A" else "B"
  println(binary32)
  //execute2()

  // Predicate like loop with multiple gaurds, or WHERE Condition in SQL..lol
  //[][] in xslt.
  val myList32 = List(1,2,3,4)
  for i<- myList32
      if i<=4
      if i % 2 != 0
      do execute2()

  // write  a for loop with yield
  val mylist2 = List(1,2,3,4)
  val returner = for i<- mylist2 if i==2
                 yield 1+1
  println(returner)

  //yields a list back to the val
  val names = List("chris", "ed", "maurice")
  val capNames = for i <- names yield i.capitalize
  println(capNames)

  val fruits = List("apple", "banana", "lime", "orange")
  val holder = for i <- fruits if i.length > 5 yield i
  println(holder)

  //13.10.2024 switch like program match case
  val i = "10"
  i match
    case "1" => println("I am One")
    case "dfg" => println("I am Two")
    case "10" => println("I am Two")
    case _ => println("I am Other")

  var temp1 = 89.22
  var result2 = temp1 match
    case 90.22 => "get 43"
    case 99.11 => "dfd"
    case 89.22 => "kjkjjsd"
  println(result2)

  var temp2 = 34
  var result4 = temp2 match
    case 34   => "Integer"
  println(result4)

  //executeParam("Gopala",2)
  //matchers(32)

  // Call the method and print the result
  val result = getClassAsString("Hello")
  //println(result) // This will print: 'Hello' is a String

  //various data types
  val x: Int = 1
  val b: Byte = 1
  val l: Long = 1
  val s: Short = 1
  //Double is used for extremeley large decimal points such as 10 pow 308 to 10 10 pow -324
  val d: Double = 2.0
  val f: Float = 3.0
  var biggerInt = BigInt(1_234_567_890_987_654_321L)
  var biggerDecimal = BigDecimal(123_456.789)
  val num2s:List[Int] = List(1,2,3)
  val num3s = List(1,2,3)

  println(x)
  println(num2s)
  println(num3s)

  try
    val k32:Float = 2344.991
    var temp35 = k32 * 2
    temp35 = temp35 / 0
    println(temp35)
  catch
    case ioe: IOException => println("Got an IOException.")
    case nfe: NumberFormatException => println("Got a NumberFormatException.")
    case _ => println("some exception")
  finally
    println("im here finally..")

  var xer = 34

  while
    xer < 40
  do
    println(xer)
    xer += 1


}
def execute2():
Unit = {
 println("test 32")
}

// to includes the upper bound 0 to 2 is 0,1,2 where 0 until 2 is 0,1
// function with parameter
def executeParam(i:String, count:Int):
Unit = {
  println("Hello " + i + " " + count)
  for k<- 0 to count do println("to" + i)
  for k<- 0 until count do println("Until" + i)
}

def matchers(i:Int):
Unit = {
  i match
    case 1 => println("case 1 printing")
    case _ => println("case Other printing")
}

def getClassAsString(x: Matchable): String = x match
  case x: String => s"'$x' is a String"
  case x: Int => "Int"
  case x: Double => "Double"
  case x: List[?] => "List"
  case _ => "Unknown"