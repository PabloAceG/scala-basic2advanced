import scala.collection.mutable.ArrayBuffer

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

class Pizza (
    var crustSize: CrustSize,
    var crustType: CrustType,
    val toppings: ArrayBuffer[Topping]
) {

    def addTopping(t: Topping): Unit = toppings += t
    def removeTopping(t: Topping): Unit = toppings -= t
    def removeAllToppings(): Unit = toppings.clear()

}

class Order (
    val pizzas: ArrayBuffer[Pizza],
    var customer: Customer
) {

    def addPizza(p: Pizza): Unit = pizzas += p
    def removePizza(p: Pizza): Unit = pizzas -= p

    // need to implement these
    def getBasePrice(): Int = 15
    def getTaxes(): Int = 3
    def getTotalPrice(): Int = 18

    def printOrder(): Unit = print(pizzas.toString())
}
class Customer (
    var name: String,
    var phone: String,
    var address: Address
)

class Address (
    var street1: String,
    var street2: String,
    var city: String,
    var state: String,
    var zipCode: String
)

object MainDriver extends App {

    val p1 = new Pizza (
        MediumCrustSize,
        ThinCrustType,
        ArrayBuffer(Cheese)
    )

    val p2 = new Pizza (
        LargeCrustSize,
        ThinCrustType,
        ArrayBuffer(Cheese, Pepperoni, Sausage)
    )

    val address = new Address (
        "123 Main Street",
        "Apt. 1",
        "Talkeetna",
        "Alaska",
        "99676"
    )

    val customer = new Customer (
        "Alvin Alexander",
        "907-555-1212",
        address
    )

    val o = new Order(
        ArrayBuffer(p1, p2),
        customer
    )

    o.addPizza(
        new Pizza (
            SmallCrustSize,
            ThinCrustType,
            ArrayBuffer(Cheese, Mushrooms)
        )
    )

    // print the order
    o.printOrder

}
