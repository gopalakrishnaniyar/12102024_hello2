package org.HigherOrder.com

@main
def main(): Unit = {
  println("Hello world!")
  val myList = List(1,2,3,4,5)

  // => Similar to .pmd scripting or javascripting ..s
  println( myList.map(i => i*2) )
  println( myList.map(_ *2) )

  // <- operator is the generator typically used in for loop for iterating collections

  for(item <- myList) do println(item*2)
  val newList = for(item <- myList) yield (item*2)
  println(newList)

}

