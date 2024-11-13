
@main
def main(): Unit = {
  println("Hello world!")
  myMethod("j")
  myMethod(66.34)
}

def myMethod(a:Any):
Unit = {
  println("hello from mymethod." + a)
}

