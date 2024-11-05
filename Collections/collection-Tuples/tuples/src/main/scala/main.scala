
@main
def main(): Unit = {
  println("Hello world!")

  val myLister32 = (1 to 10).toList
  println(myLister32)
  println("Fold Left: " + myLister32.foldLeft(0)((a, b) => a + b))
  println("Reduce Left: " + myLister32.reduceLeft((a, b) => a + b))


}

