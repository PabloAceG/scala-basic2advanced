// An anonymous function is like a little mini-function
// Can also create a list like this
val ints = List.range(1,10)

val doubleInts = ints.map(_ * 2) // Can also be writen like this:
// ints.map((i: Int) => i * 2)
// ints.map(i => i * 2)

// The _ character in Scala is something of a wildcard character.

// Anonymous functions witht the filter method
val x = ints.filter(_ > 5)
val y = ints.filter(_ < 5)
val z = ints.filter(_ % 2 == 0)

// Bonus: Digging a little bit deaper

// The map expects to receive a function that transforms one Int value into 
// another Int value
// Similarly, when called on a List[Int], the filter method expects to receive a
// function that takes an Int and returns a Boolean value.
// def lessThanFive(i: Int): Boolean = (i < 5) equivalent to:
val w = ints.filter(_ < 5)

