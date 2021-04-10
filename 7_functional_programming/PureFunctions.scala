// Pure function definition:
// - The function’s output depends only on its input variables
// - It doesn’t mutate any hidden state
// - It doesn’t have any “back doors”: It doesn’t read data from the outside
//   world (including the console, web services, databases, files, etc.), or
//   write data to the outside world

// Many functions in Scala are pure functions:
// scala.math._ package: abs, ceil, max, min
// Scala String methods: isEmpty, length, substring
// Scala Collectins: drop, filter, map
// ...

// Examples of impure functions
// For example, the foreach method. It's only used for it's side effects, such as
// printing to STDOUT. Hind: it returns Unit type. As it returns nothing, only
// call this function for it's side effects.
// Similarly, any function that returns Unit is considered impure function.
// Day and time methods are also impure methods, because their output depends on
// more than their input parameters.
//
// Impure functions can be generally defined as:
// - Read hidden inputs, i.e., they access variables and data not explicitly
//   passed into the function as input parameters
// - Write hidden outputs
// - Mutate the parameters they are given
// - Perform some sort of I/O with the outside world

// Impure functions are needed
// Write the core of your application using pure functions, and then write an
// impure “wrapper” around that core to interact with the outside world. If you
// like food analogies, this is like putting a layer of impure icing on top of a
// pure cake.

// Writing pure functions
def double(i: Int): Int = i * 2
def sum(list: List[Int]): Int = list match {
    case Nil => 0
    case head :: tail => head + sum(tail)
}

// Key points
// A pure function is a function that depends only on its declared inputs and its
// internal algorithm to produce its output. It does not read any other values
// from “the outside world” — the world outside of the function’s scope — and it
// does not modify any values in the outside world.
// A second key point is that real-world applications consist of a combination of
// pure and impure functions. A common recommendation is to write the core of
// your application using pure functions, and then to use impure functions to
// communicate with the outside world.
