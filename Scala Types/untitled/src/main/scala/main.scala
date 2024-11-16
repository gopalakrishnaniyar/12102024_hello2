
@main
def main(): Unit = {
  println("Hello world!")
  myMethod("j")
  myMethod(66.34)
  myMethod("66.34")
  myMethod2(557)
  myMethod3(557.2)
}

def myMethod(a:Any):
Unit = {
  println("hello from mymethod." + a )
}

def myMethod2(a:Int):
Unit = {
  println("hello from mymethod2" + a )
}

def myMethod3(a:BigDecimal):
Unit = {
  println("hello from mymethod3" + a )
}

