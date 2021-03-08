// Scala also has a concept of an abstract class that is similar to Java's 
// abstract class. But because traits are so powerful, you rarely need to use 
// an abstract class. In fact, you only need to use an abstract class when:
//    You want to create a base class that requeries contructor arguments.
//    Your Scala code will be called from Java code.

// Scala traits don't allow contructor parameters
// this won't compile
// trait Animal(name: String)
// need
abstract class Animal(name: String) { }

// When Scala code will be called from Java code
// Because Java doesn't know anything abouut Scala traits, if you want to call 
// your Scala code from Java code you'll need to use an abstract class rather 
// than a trait.

// Abstract class syntax
abstract class Pet (name: String) {
    def speak(): Unit = println("Yo") // concrete implementation
    def comeToMaster(): Unit          // abstract method
}

class Dog(name: String) extends Pet(name) {
    override def speak() = println("Woof")
    def comeToMaster() = println("Here I come!")
}

val d = new Dog("Rover")
d.speak
d.comeToMaster

