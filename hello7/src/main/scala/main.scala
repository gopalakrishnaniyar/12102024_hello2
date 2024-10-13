import scala.io.StdIn.readLine

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
}
def execute2():
Unit = {
 println("test 32")
}