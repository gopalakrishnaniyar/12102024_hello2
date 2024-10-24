
@main
def main(): Unit = {
  println("Hello world!")

  val a = List(1, 2, 3)
  val b = (1 to 10).toList
  val c = (1 until 10).toList
  val d = (1 to 10 by 3).toList
  val f = List.range(1, 5)
  val g = List.range(1, 10, 3)
  println(b)
  println(c)
  println(d)
  println(f)
  println(g)

  val myList = List(10, 20, 30, 40, 10)
  println(myList)
  var newRevampList = myList.drop(1)
  println(newRevampList)
  newRevampList = newRevampList.filter(_ < 25)
  println(newRevampList)

}

