// Besides using them as interfaces, they can also be used as abstract classes.
// More accurately as mixins

// First Example
trait Pet {
    def speak = println("Yo") // concrete implementation of a speak method
    def comeToMaster(): Unit
}

// when a trait is extended, each abstract method must be implemented:
class Dog(name: String) extends Pet {
    def comeToMaster(): Unit = println("Woo-hoo, I'm coming!")
}

val d = new Dog("Zeus")
d.speak
d.comeToMaster

// Ocerriding an implemented method
class Cat extends Pet {
    // override 'speak'
    override def speak(): Unit = println("meow")
    def comeToMaster(): Unit = println("That's not gonna happen.")
}

val c = new Cat
c.speak
c.comeToMaster

// Mixing in multiple traits that have behavours
trait Speaker {
    def speak(): String   //abstract
}

trait TailWagger {
    def startTail(): Unit = println("tail is wagging")
    def stopTail(): Unit = println("tail is stopped")
}

trait Runner {
    def startRunning(): Unit = println("I'm running")
    def stopRunning(): Unit = println("Stopped running")
}

class Dog2(name: String) extends Speaker with TailWagger with Runner {
    def speak(): String = "Woof!"
}

class Cat2 extends Speaker with TailWagger with Runner {
    def speak(): String = "Meow"
    override def startRunning(): Unit = println("Yeah ... I don't run")
    override def stopRunning(): Unit = println("No need to stop")
}
val d2 = new Dog2("Hermes")
d2.speak
d2.startRunning
d2.stopRunning

val c2 = new Cat2
c2.speak
c2.startRunning
c2.startTail

// Mixing traits in on the fly
val d3 = new Dog("Fido") with TailWagger with Runner
d3.startTail
d3.startRunning

