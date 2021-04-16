// A case class has all of the functionality of a regular class, and more. When
// the compiler sees the case keyword in front of a class, it generates code for
// you, with the following benefits:
// - Case class constructor parameters are public val fields by default, so
//   accessor methods are generated for each parameter.
// - An apply method is created in the companion object of the class, so you
//   don’t need to use the new keyword to create a new instance of the class.
// - An unapply method is generated, which lets you use case classes in more
//   ways in match expressions.
// - A copy method is generated in the class. You may not use this feature in
//   Scala/OOP code, but it’s used all the time in Scala/FP.
// - equals and hashCode methods are generated, which let you compare objects
//   and easily use them as keys in maps.
// - A default toString method is generated, which is helpful for debugging.

// With apply you don't need new
case class Person(name: String, relation: String)
val christina = Person("Christina", "niece")

// No mutator methods
println(christina.name) // can't mutate the 'name' field
// Because in FP you never mutate data structures, it makes sense that
// constructor fields to val.

// An unapply method
// Also automatically generates unapply method.
trait Person2 {
  def name: String
}

case class Student(name: String, year: Int) extends Person2
case class Teacher(name: String, speciality: String) extends Person2

// Because those are defined as case classes — and they have built-in unapply
// methods — you can write a match expression like this:
def getPrintableString(p: Person2): String = p match {
    case Student(name, year) =>
        s"$name is a student in Year $year."
    case Teacher(name, whatTheyTeach) =>
        s"$name teaches $whatTheyTeach."
}

// Notice patters case __() =>
// Those patterns work because Student and Teacher are defined as case classes
// that have unapply methods whose type signature conforms to a certain standard.
// Technically, the specific type of pattern matching shown in these examples is
// known as a constructor pattern.
// The Scala standard is that an unapply method returns the case class
// constructor fields in a tuple that’s wrapped in an Option. The “tuple” part
// of the solution was shown in the previous lesson.

val s = Student("A1", 1)
val t = Teacher("Bob Donnan", "Mathematics")

println(getPrintableString(s))
println(getPrintableString(t))

// All of this content on unapply methods and extractors is a little advanced for
// an introductory book like this, but because case classes are an important FP
// topic, it seems better to cover them, rather than skipping over them.

// copy method
// A case class also has an automatically-generated copy method that’s extremely
// helpful when you need to perform the process of
// a) cloning an object.
// b) updating one or more of the fields during the cloning process.
case class BaseballTeam(name: String, lastWorldSeriesWin: Int)
val cubs1908 = BaseballTeam("ChicagoTeam", 1908)
val cubs2016 = cubs1908.copy(lastWorldSeriesWin = 2016)

// equals and hashCode methods
// Case classes also have automatically-generated equals and hashCode methods,
// so instances can be compared:
case class Person3(name: String, relation: String)
val chistina = Person3("Christina", "niece")
val hannah = Person3("Hannah", "niece")
println(christina.equals(hannah))

// toString methods
println(christina)

// The biggest advantage
// While all of these feature are great benefits to functional programming, "the
// biggest advantage of case classes is that they support pattern matching".
// Pattern matching is a major feature of FP languages, and Scala's case classes
// provide a simple way yto implement pattern matching in match expressions and
// other areas.
