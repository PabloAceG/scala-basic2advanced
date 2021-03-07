/*
 * Tip:  If you use Scala to write OOP code, create your fields as var fields 
 * so you can mutate them. When you write FP code with Scala, you’ll generally 
 * use case classes instead of classes like this. (More on this later.)
 */
class Person(val firstName:String, val lastName:String)

val p = new Person("Bill", "Panner")
println(p.firstName + " " + p.lastName)

class Person2(var firstName:String, var lastName:String) {
    println("The constructor begins")

    // 'public' access by default
    var age = 0

    // some class fields
    private val HOME = System.getProperty("user.home")

    // some methods
    override def toString(): String = s"$firstName $lastName is $age years old"

    def printHome(): Unit = println(s"HOME = $HOME")
    def printFullName(): Unit = println(this)

    printHome()
    printFullName()
    println("you've reached the end of the constructor")
}
val p2 = new Person2("Kim", "Carnes")

class Pizza (var crustSize: Int, var crustType: String)

// a stock, like AAPL or GOOG
class Stock(var symbol: String, var price: BigDecimal)

// a network socket
class Socket(val timeout: Int, val linger: Int) {
    override def toString = s"timeout: $timeout, linger: $linger"
}

class Address (
    var street1: String,
    var street2: String,
    var city: String,
    var state: String
)

