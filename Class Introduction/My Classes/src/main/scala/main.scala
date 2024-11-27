import scala.collection.mutable.ListBuffer

@main
def main(): Unit = {
  val myArr = Array(1, 2, 3, 4, 5)
  val myList = ListBuffer.empty[Int]

  myArr.foreach(println(_))
  val test = myArr.filter(_>3)
  print(test.mkString("Array(", ", ", ")"))
  myArr.foreach(myList += _)

  println(myList.toList) // Output: ListBuffer(1, 2, 3, 4, 5)

  val myList1 = List.empty[Int]
  val myList2 = List.empty[Int]
  val myListBuff1 = ListBuffer.empty[Int]

  val newList  = myList1 :+ 1 :+4
  val newList2 = 43 :: newList
  println(newList)
  println(newList2)

  println("waiting sleep...")
  Thread.sleep(1000)
  println("Here")

}

