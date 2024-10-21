package org.HigherOrder.com


@main
def main(): Unit = {
  println("Hello world!")
  val myList = List(1,2,3,4,5)

  // => Similar to .pmd scripting or javascripting ..s
  println( myList.map(i => i*2) )
  println( myList.map(_ *2) )

  //
  val temp = myList.map(i => doubleWrapper(i))
  println(temp)

  // <- operator is the generator typically used in for loop for iterating collections

  for(item <- myList) do println(item*2)
  val newList = for(item <- myList) yield (item*2)
  println(newList)

  //
  println(myList.map(i => i.toDouble))

  val numbes = (1 to 10).toList
  println(numbes)

  // immutable list multiple
  val newNumbers = numbes.filter(i => i % 2 == 0).filter(_ > 4).map(_ * 10)
  println(newNumbers)

  val nums = (1 to 10).toList // List(1,2,3,4,5,6,7,8,9,10)

  // methods can be chained together as needed
  val x = nums.filter(_ > 3)
    .filter(_ < 7)
    .map(_ * 10)

  object StringUtils:
    def leftTrim(s: String): String = s.replaceAll("^\\s+", "")
    def rightTrim(s: String): String = s.replaceAll("^\\s+", "")

  val result = StringUtils.leftTrim("    hello, Scala!")
  val result2 = StringUtils.rightTrim("kk    ")
  println(result) // Output: "hello, Scala!"

}

