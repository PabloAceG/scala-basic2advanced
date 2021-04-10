// It is an objects declared in the same file as a class and with the same name.

class SomeClass {
  def printFilename() = {
    println(SomeClass.HiddenFilename)
  }
}

object SomeClass {
  private val HiddenFilename = "/tmp/foo.bar"
}

// Creating new instances without the new keyword
// This functionality comes from the use of companion objects. What happens is
// that when you define an apply method in a companion object, it has a special
// meaning to the Scala compiler.
class Person {
  var name: Option[String] = None
  var age: Option[Int] = None
  override def toString = s"$name, $age"
}

object Person {

  // a one-arg constructor
  def apply(name: Option[String]): Person = {
    var p = new Person
    p.name = name
    p
  }

  // a two-arg contructor
  def apply(name: Option[String], age: Option[Int]): Person = {
    var p = new Person
    p.name = name
    p.age = age
    p
  }

}

val zenMasters = List(
  Person(Some("Nansen")),
  Person(Some("Joshu"))
)

// Scala lets type this code
val p = Person(Some("Fred Flinstone"))
// and during the compilation process the compiler turns that code into this
// code:
// val p = Person.apply("Fred Flinstone")
val p1 = Person(Some("Fred"))
val p2 = Person(None)

val p3 = Person(Some("Wilma"), Some(33))
val p4 = Person(Some("Wilma"), None)

// Adding an unapplay method
// Lets de-construct object instances.
class Person2(var name: String, var age: Int)

object Person2 {
  def unapply(p: Person2): String = s"${p.name} ${p.age}"
}

val np = new Person2("Lori", 29)
val result = Person2.unapply(np)

// A benefit of using unnaply to create an extractor is that if you follow the
// proper Scala conventions, they enable a convinient form of pattern-matching
// expressions.

