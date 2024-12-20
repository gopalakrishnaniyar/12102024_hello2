
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
  newRevampList = newRevampList.filter(_ < 100)
  println(newRevampList)
  newRevampList = newRevampList.dropWhile(_ < 25)
  println(newRevampList)
  newRevampList = newRevampList.takeWhile(_ >= 30)
  println(newRevampList)
  newRevampList = newRevampList.take(1)
  println(newRevampList)

  // dropwhile and takewhile always starts from left most element

  val a3 = List(List(34, 2), List(3, 4))
  println(a3.flatten.sorted)


  // New Slice last position -1..
  val newlist1 = List(1,2,3,4,5,6)

  var copyList = newlist1
  println(copyList)

  println(newlist1.slice(2,5))
  println(newlist1)
  println(newlist1.head)
  println(newlist1.tail)
  //not assummed as lat element, but all elements except the first one.
  // list are immutable
  //

  val nums = List("one", "two")
  println(nums.map(_.toUpperCase)) // List("ONE", "TWO")
  println(nums.flatMap(_.toUpperCase).map(_ + "1"))

  val myLister1 = (1 to 4).toList
  val sum2 = myLister1.reduceLeft((x,y) => x+y)
  println(sum2)

  val myLister = (1 to 10).toList
  val sum = myLister.foldLeft(100)(_ + _)
  println(sum)
  val sumOfEven = myLister.foldLeft(0)((cnt, num) => if num % 2 == 0 then cnt + 1 else cnt)
  println(sumOfEven)

  val myLister32 = (1 to 10).toList
  println(myLister32)
  println("Fold Left: " + myLister32.foldLeft(0)((a, b) => a + b))
  println("Reduce Left: " + myLister32.reduceLeft((a, b) => a + b))


  // fold left has a seed value
  // reduce left, first element in left is always the seed value

}

