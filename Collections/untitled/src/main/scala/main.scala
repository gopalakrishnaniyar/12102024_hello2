
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
}

