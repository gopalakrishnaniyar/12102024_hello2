import scala.collection.mutable.ListBuffer

@main
def main(): Unit = {
  val myArr = Array(1, 2, 3, 4, 5)
  val myList = ListBuffer.empty[Int]

  myArr.foreach(println(_))
  val test = myArr.filter(_>3)
  print(test.mkString("Array(", ", ", ")"))
  myArr.foreach(myList += _)

  println(myList) // Output: ListBuffer(1, 2, 3, 4, 5)
}

