import scala.io.StdIn.readLine

@main
def popop():
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
}
