// Can use trait as original Java interface

// Simple example
trait TailWagger {
    def startTail(): Unit
    def stopTail(): Unit
}

// Extending a trait
class Dog extends TailWagger {
    // the implemented methods
    def startTail(): Unit = println("tail is wagging")
    def stopTail(): Unit = println("tail is stopped")
}

val d = new Dog
d.startTail
d.stopTail

// Extending multiple traits
trait Speaker {
    def speak(): String
}

trait Runner {
    def startRunning(): Unit
    def stopRunning(): Unit
}

class Dog2 extends Speaker with TailWagger with Runner {
    // Speaker
    def speak(): String = "Woof!"

    // TailWagger
    def startTail(): Unit = println("tail is wagging")
    def stopTail(): Unit = println("tail is stopped")

    // Runner
    def startRunning(): Unit = println("I'm running")
    def stopRunning(): Unit = println("Stopped running")
}

val d2 = new Dog2
d2.speak
d2.startTail
d2.stopTail
d2.startRunning
d2.stopRunning

