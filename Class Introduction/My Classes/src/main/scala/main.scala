class myClass1(var i: String,var j:Int)
{
  def myMethod(): Unit={ println("testing..." + i) }
  def myMethod2(): Int={
    val num1 = scala.io.StdIn.readLine().toInt
    j+num1
  }
}
// no need of return keyword. just grab the arg from class param and use it inside method
@main
def main(): Unit = {
  val obj = new myClass1("Ä",23)
  obj.myMethod()
  println(obj.myMethod2())
}

