val m = Map(
    1 -> "a", 
    2 -> "b", 
    3 -> "c",
    4 -> "d"
)

for ((k,v) <- m) printf("key: %s, value: %s\n", k, v)

val keys = m.keys
val values = m.values

val contains3 = m.contains(3)
val ucMap = m.transform((k,v) => v.toUpperCase)
val twoAndThree = m.view.filterKeys(Set(2,3)).toMap
val firstTwoElements = m.take(2)

// Mutable Map examples
val states = scala.collection.mutable.Map(
    "AL" -> "Alabama", 
    "AK" -> "Alaska"
)
// add elements with +=
states += ("AZ" -> "Arizona")
states += ("CO" -> "Colorado", "KY" -> "Kentucky")

// remove elements with -=
states -= "KY"
states -= ("AZ", "CO")

// update elements by reassigning them
states("AK") = "Alaska, The Big State"

// retain elements by supplying a function that operates on
// the keys and/or values
states.retain((k,v) => k == "AK")

