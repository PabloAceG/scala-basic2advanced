// Scala has many custom methods:
// map
// filter
// foreach
// head
// tail
// take, takeWhile
// drop, dropWhile
// reduce

// They work on every "sequence" classes, including:
// Array, ArrayBuffer, List, Vector, etc.

// Methods don't mutate the collection 
// They work on functional style, so they return a new collection.

// Sample list
val nums = (1 to 10).toList
val names = List("joel", "ed", "chris", "maurice")

// map
// Step through each element in the existing list, applying the algorithm 
// supplied to each element, one at a time. It then returns a new list with all
// of the modified elements.
println(nums.map(_ * 2))
println(names.map(_.capitalize))
println(nums.map(_ < 5))

// filter
// Creates a new, filtered list from the given list
println(nums.filter(_ < 5))
println(nums.filter(_ % 2 == 0))
println(names.filter(_.length <= 4))

// foreach
// Used to loop over all elements in a collection.
names.foreach(println)
nums.filter(_ < 4).foreach(println)

// head
// Comes from List and functional programming languages. It is used to retrieve
// the first element of a sequence. Also works with String.
// Can also throw error when called on an empty list: NoSuchElementException
println(nums.head)
println(names.head)
"foo".head
"bar".head

// tail
// Also comes from List and functiona programming languages. Retrieves every 
// element in a list after the head element.
// Also throws the same error on empty list: UnsupportedOperationException
println(nums.tail)
println(names.tail)
"foo".tail
"bar".tail

// take, takeWhile
// Give a way of taking elements out of a list.
println(nums.take(1))
println(nums.take(2))
println(names.take(1))
println(names.take(2))
nums.takeWhile(_ < 5)
names.takeWhile(_.length < 5)

// drop, dropWhile
// Opposite from take and takeWhile
println(nums.drop(1))
println(nums.drop(5))
println(names.drop(1))
println(names.drop(2))
println(nums.dropWhile(_ < 5))
println(names.dropWhile(_ != "chris"))

// reduce
// It takes a function (or anonymous function) and aaplies that function to 
// successive elements in the list.
def add(x: Int, y: Int): Int = {
    val theSum = x + y
    println(s"received $x and $y, their sum is $theSum")
    theSum
}
val a = List(1,2,3)
a.reduce(add)
a.reduce(_ + _)
// Before moving on, an important part to know about reduce is that — as its 
// name implies — it’s used to reduce a collection down to a single value.

