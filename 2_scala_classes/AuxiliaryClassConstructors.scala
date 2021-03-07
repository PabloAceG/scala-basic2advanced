val DefaultCrustSize = 12
val DefaultCrustType = "THIN"

// the primary constructor
class Pizza (var crustSize: Int, var crustType: String) {

    // one-arg auxiliary constructor
    def this(crustSize: Int) = {
        this(crustSize, DefaultCrustType)
    }

    // one-arg auxiliary constructor
    def this(crustType: String) = {
        this(DefaultCrustSize, crustType)
    }

    // zero-arg auxiliary constructor
    def this() = {
        this(DefaultCrustSize, DefaultCrustType)
    }

    override def toString = s"A $crustSize inch pizza with a $crustType crust"
}

val p1 = new Pizza(DefaultCrustSize, DefaultCrustType)
val p2 = new Pizza(DefaultCrustSize)
val p3 = new Pizza(DefaultCrustType)
val p4 = new Pizza


/*
 * There are two important notes to make about this example:
 * -> The DefaultCrustSize and DefaultCrustType variables are not a preferred 
 *    way to handle this situation, but because we haven’t shown how to handle 
 *    enumerations yet, we use this approach to keep things simple.
 * -> Auxiliary class constructors are a great feature, but because you can use 
 *    default values for constructor parameters, you won’t need to use this 
 *    feature very often. The next lesson demonstrates how using default 
 *    parameter values like this often makes auxiliary constructors unnecessary:
 */
class Pizza2(
    var crustSize: Int = DefaultCrustSize, 
    var crustType: String = DefaultCrustType
)

/*
 * Can provide preferred values.
 * Consumers can override default values on their needs.
 * Can also name parameters when given them values:
 */
class Socket(var timeout: Int, var linger: Int) {
    override def toString = s"timeout: $timeout, linger: $linger"
}
val s = new Socket(timeout=2000, linger=3000)


