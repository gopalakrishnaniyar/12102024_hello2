object RectangleCalculator {
  // Method to calculate the area of a rectangle
  def calculateArea(length: Double, width: Double): Double = {
    length * width
  }

  // Main method
  def main(args: Array[String]): Unit = {
    println("Enter the length of the rectangle:")
    val length = scala.io.StdIn.readDouble()

    println("Enter the width of the rectangle:")
    val width = scala.io.StdIn.readDouble()

    val area = calculateArea(length, width)
    println(s"The area of the rectangle is: $area")
  }
}
