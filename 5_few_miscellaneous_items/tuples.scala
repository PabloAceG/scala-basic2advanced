// A tuple is a way to store heterogenous items in the same container.
class Person(var name: String)

val t = (3, "Three", new Person("Al"))
// Scala tuples can contain between two and 22 items

// To access elements
println(t._1)
println(t._2)
println(t._3)

// Another feature is access them using multiple assignments
val x, y, z = (3, "Three", new Person("David"))

// Returning a tuple from a method
// Nice to return multiple values
def getStockInfo = {
  ("NFLX", 100.00, 101,00) // this is Tuple3
}
val (symbol, currentPrice, bidPrice) = getStockInfo

// Tuples are not collections, they are just containers. Because they aren't
// collections, they don't have methods like map, filter, etc.
