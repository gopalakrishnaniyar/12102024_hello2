
@main
def main(): Unit = {
  println("Hello world!")

  val a = List(1, 2, 3)
  val b = (1 to 10).toList
  val c = (1 until 10).toList
  val d = (1 to 10 by 3).toList
  println(b)
  println(c)
  println(d)
}

