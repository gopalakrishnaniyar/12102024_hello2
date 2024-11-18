class myClass1(var i: String,var j:Int)
{
  def myMethod(): Unit={ println("testing..." + i) }
  def myMethod2(): Int={ return j+10 }
}

@main
def main(): Unit = {
  val obj = new myClass1("Ä",23)
  obj.myMethod()
  println(obj.myMethod2())
}

