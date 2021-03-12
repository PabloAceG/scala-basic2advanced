class Person(val name:String)

// Indexed immutable sequence
// Meaning can access very quickly to indexed elements

val nums = Vector(1, 2, 3, 4, 5)

val strings = Vector("one", "two")

val peeps = Vector(
    "Bert",
    "Ernie",
    "Grover"
)

// It is immutable so need to create new sequence to add element
val a = Vector(1,2,3)
val b = a :+ 4
val c = a ++ Vector(4, 5)

// Prepent
val d = 0 +: a
val e = Vector(-1, 0) ++: a

// As it is not linked list, it is rather an indexed list of elements,
// prepend and append have the same time complexity.

// Iteration
val names = Vector("Joel", "Chris", "Ed")
for (name <- names) println(name)

