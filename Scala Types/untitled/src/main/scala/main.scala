
@main
def main(): Unit = {
  println("Hello world!")
  myMethod("j")
  myMethod(66.34)
  myMethod("66.34")
  myMethod2(557)
}

def myMethod(a:Any):
Unit = {
  println("hello from mymethod." + a )
}

def myMethod2(a:Int):
Unit = {
  println("hello from mymethod2." + a )
}

