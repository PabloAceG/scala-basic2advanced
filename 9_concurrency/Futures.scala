// You could still use the native Java Thread — but the Scala Future makes
// parallel/concurrent programming much simpler, and it’s preferred.
// Here’s a description of Future from its Scaladoc:
// “A Future represents a value which may or may not currently be available, but
// will be available at some point, or an exception if that value could not be
// made available.”


// Thinking in Futures
def aShortRunningTask(): Int = 42
val x = aShortRunningTask

def aLongRunningTask(): Future[Int] = {}
val x = aLongRunningTask
// Value will be available at some point (in the future).
// Intended as a one-shot, “Handle this relatively slow computation on some other
// thread, and call me back with a result when you’re done” construct.


// Other Futures Methods
// Futures have other methods that you can use. Common callback methods are:
//
//    onComplete
//    onSuccess
//    onFailure
//
// In addition to those methods, futures have methods that you’ll find on Scala
// collections classes, including:
//
//    filter
//    foreach
//    map
//
// Other useful and well-named methods include:
//
//    andThen
//    fallbackTo
//    recoverWith
