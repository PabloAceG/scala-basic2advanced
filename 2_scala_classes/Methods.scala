// Defining method that takes on input parameter
def double(a: Int) = a * 2
println(double(2))

// Showing the method's return type
def triple(a: Int): Int = a * 3
println(triple(2))

// Methods with multiple input parameters
def add(a: Int, b: Int): Int = a + b
def add(a: Int, b: Int, c: Int): Int = a + b + c
println(add(1, 2))
println(add(1, 2, 3))

// Multiple line methods
def addThenDouble(a: Int, b: Int): Int = {
    val sum = a + b
    val doubled = sum * 2
    doubled
}
println(addThenDouble(1, 1))

