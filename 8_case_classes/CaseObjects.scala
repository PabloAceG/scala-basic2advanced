// Use Scala object when you want to create a singleton object. As the
// documentation states, "Methos and values aren't associated with individual
// of a class belonging in singleton objects, denoted by using the keyword
// object instead of class".
// This is the case when creating "utilities":
// object PizzaUtils {
//     def addTopping(p: Pizza, t: Topping): Pizza = ...
//     def removeTopping(p: Pizza, t: Topping): Pizza = ...
//     def removeAllToppings(p: Pizza): Pizza = ...
// }
// object FileUtils {
//     def readTextFileAsString(filename: String): Try[String] = ...
//     def copyFile(srcFile: File, destFile: File): Try[Boolean] = ...
//     def readFileToByteArray(file: File): Try[Array[Byte]] = ...
//     def readFileToString(file: File): Try[String] = ...
//     def readFileToString(file: File, encoding: String): Try[String] = ...
//     def readLines(file: File, encoding: String): Try[List[String]] = ...
// }


// Case Objects
// Is like an object, but has more features than a regular object (just like
// case class):
// - Serializable.
// - Default hashCode implementation.
// - Improved toString implementation.
// Because of these features case objects are primarly used in two places
// (instead of regular objects):
// - When creating enumerations.
// - When creating containers for "messages" that you want to pass between other
//   objects.


// Creating Enumerations with Case Objects
sealed trait Topping
case object Cheese extends Topping
case object Pepperoni extends Topping
case object Sausage extends Topping
case object Mushrooms extends Topping
case object Onions extends Topping

sealed trait CrustSize
case object SmallCrustSize extends CrustSize
case object MediumCrustSize extends CrustSize
case object LargeCrustSize extends CrustSize

sealed trait CrustType
case object RegularCrustType extends CrustType
case object ThinCrustType extends CrustType
case object ThickCrustType extends CrustType

case class Pizza (
    crustSize: CrustSize,
    crustType: CrustType,
    toppings: Seq[Topping]
)

// Using Case Objects as Messages
case class StartSpeakingMessage(textToSpeak: String)
case object StopSpeakingMessage
case object PauseSpeakingMessage
case object ResumeSpeakingMessage
// NOTE: StartSpeakingMessage is defined as a case class rather than a case
// object. This is because a case object can’t have any constructor parameters.

// class Speak extends Actor {
//     def receive = {
//         case StartSpeakingMessage(textToSpeak) =>
//         // code to speak the text
//         case StopSpeakingMessage =>
//         // code to stop speaking
//         case PauseSpeakingMessage =>
//         // code to pause speaking
//         case ResumeSpeakingMessage =>º
//         // code to resume speaking
//   }
// }
