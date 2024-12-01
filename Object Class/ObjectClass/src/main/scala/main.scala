object RectangleCalculator {
  // Method to calculate the area of a rectangle
  def calculateArea(length: Double, width: Double): Double = {
    length * width
  }
  // Main method
  def main(args: Array[String]): Unit = {
    val temp44 = List("1","2","23","4")
    val result = temp44.filter(item => if (item == "23") true else false )
    println(result)
  }
}
