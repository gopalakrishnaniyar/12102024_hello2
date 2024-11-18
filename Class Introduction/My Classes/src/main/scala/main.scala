class myClass1(var i: String)
{
  def myMethod(): Unit={ println("testeting..." + i) }
}

@main
def main(): Unit = {
  val obj = new myClass1("Ä")
  obj.myMethod() // This will only print "printing..Ä"
}

