// Scala allows creating functions as variables
val nums = (1 to 10).toList

val doubles = nums.map(_ * 2)
val lessThanFive = nums.filter(_ < 5)

// Smaes a spassing a regular function
def double(i:Int): Int = i * 2
def otherDoubles = nums.map(double)

// Function or method
// It is preferred the def syntax rather than function
// 1. The def syntax is more familiar to people coming from C/Java/C# background.
// 2. You can see def methods just like they are val functions. That means that a
//    "function" can be defined as passed as parameter.

// Examples
List("foo", "bar").map(_.toUpperCase)
List("foo", "bar").map(_.capitalize)
List("adam", "scott").map(_.length)
List(1,2,3,4,5).map(_ * 10)
List(1,2,3,4,5).filter(_ > 2)
List(5,1,3,11,7).takeWhile(_ < 6)

// Other ways of doing the same thing
def toUpper(s: String): String = s.toUpperCase
List("foo", "bar").map(toUpper)
List("foo", "bar").map(s => toUpper(s))
List("foo", "bar").map(s => s.toUpperCase)
List("foo", "bar").map(_.toUpperCase)
