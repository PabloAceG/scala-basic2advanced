// Option/Some/None
def toInt(s: String): Option[Int] = {
    try {
        Some(Integer.parseInt(s.trim))
    } catch {
        case e: Exception => None
    }
}

// toInt(x) match {
//     case Some(i) => println(i)
//     case None => println("That didn't work.")
// }
//
// val y = for {
//     a <- toInt(stringA)
//     b <- toInt(stringB)
//     c <- toInt(stringC)
// } yield a + b + c

// Try/Success/Failure
// Like Option, Some and None but with two nice features:
// - Try makes it very simple to catch exceptions.
// - Failure contains the exception.
import scala.util.{Try,Success,Failure}

def toInt2(s: String): Try[Int] = Try {
    Integer.parseInt(s.trim)
}
val a = toInt2("1")
val b = toInt2("boo")

// toInt(x) match {
//     case Success(i) => println(i)
//     case Failure(s) => println(s"Failed. Reason: $s")
// }
//
// val y = for {
//     a <- toInt(stringA)
//     b <- toInt(stringB)
//     c <- toInt(stringC)
// } yield a + b + c

// Even more...
// There are other classes that work in a similar manner, including
// Either/Left/Right in the Scala library, and other third-party libraries, but
// Option/Some/None and Try/Success/Failure are commonly used, and good to learn
// first.
// You can use whatever you like, but Try/Success/Failure is generally used when
// dealing with code that can throw exceptions — because you almost always want
// to understand the exception — and Option/Some/None is used in other places,
// such as to avoid using null values.
