val ints: List[Int] = List(1, 2, 3)
val names: List[String] = List("Joel", "Chris", "Ed")

val a = List(1, 2, 3) // Because it is immutable, can't add new elements to it.
val b = 0 +: a            // prepend
val c = List(-1, 0) ++: a 

// Can also append, but as it is a Singly-LinkedList it is a relativily slow
// operation - specially with large sequences
// If want both to append and prepend better use Vector

// Should also avoid accessing elements of large lists by their index value.

for (name <- names) println(name) // Also works with ArrayBuffer, List, Seq,
                                  // Vector, etc.

val someInts = List(1, 2, 3)  // These two are equivalent
val list = 1 :: 2 :: 3 :: Nil


