// In Functional Programming it is not a good praxis to return null values.

// A first example
// Writing a function that casts a String to an Integer there might be the case
// where the parameter cannot be transformed.
def toInt(s: String): Int = {
  try {
    Integer.parseInt(s.trim)
  } catch {
    case e: Exception => 0
  }
}


// Using Option/Some/None
// - You declare that toInt returns an Option type
// - If toInt receives a string it can convert to an Int, you wrap the Int inside of a Some
// - If toInt receives a string it can’t convert, it returns a None
def toInt2(s: String): Option[Int] = {
  try {
    Some(Integer.parseInt(s.trim))
  } catch {
    case e: Exception => None
  }
}

val a = toInt2("1")
val b = toInt2("foo")

// It is used to handle exceptions, and the technique works for handling null
// values.


// Being a Consumer of Some
toInt2("3") match {
  case Some(i) => println(i)
  case None => println("That didn't work")
}

val stringA = "1"
val stringB = "2"
val stringC = "3"
val y = for {
  a <- toInt(stringA)
  b <- toInt(stringB)
  c <- toInt(stringC)
} yield a + b + c

// Options can be thought as a container of 0 or 1 items
// One good way to think about the Option classes is that they represent a
// container, more specifically a container that has either zero or one item
// inside:
// - Some is a container with one item in it
// - None is a container, but it has nothing in it
// If you prefer to think of the Option classes as being like a box, None is a
// little like getting an empty box for a birthday gift.


// Using Option to replace null values
class Address (
    var street1: String,
    var street2: String,
    var city: String,
    var state: String,
    var zip: String
)

val santa = new Address(
    "1 Main Street",
    null,               // <-- D'oh! A null value!
    "North Pole",
    "Alaska",
    "99705"
)

// To handle situations where some fields are going to be null
class Address2 (
    var street1: String,
    var street2: Option[String],
    var city: String,
    var state: String,
    var zip: String
)

val santa2 = new Address2(
    "1 Main Street",
    None,
    "North Pole",
    "Alaska",
    "99705"
)
val santa3 = new Address2(
    "123 Main Street",
    Some("Apt. 2B"),
    "Talkeetna",
    "Alaska",
    "99676"
)


// Option isn't the only solution
// Can also use try/success/failure (used to connections to databases, internet
// services, interact with files, etc.):
// - Although tend to be used when can through exceptions
// - Failure class gives access to exception message.
