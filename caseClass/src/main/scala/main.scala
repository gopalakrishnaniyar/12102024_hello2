case class Address(city: String,street : String)
case class Person(name : String, age: Int)

@main
def main(): Unit = {
  val addresses = List(Address("New York","5th Avenue"),Address("Manhattan","6th Avenue"))
  val sortedAddress = addresses.sortBy(item => (item.city,item.street))
  println(addresses)
  println(sortedAddress)
  sortedAddress.foreach(println)

  val person1 = Person("Alice",30)
  println(person1.name)
}

