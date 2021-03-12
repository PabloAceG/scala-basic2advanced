// Iterable sequence that consists of pairs of keys and values
import scala.collection.mutable.Map

val states = Map(
    "AK" -> "Alaska",
    "IL" -> "Illinois",
    "KY" -> "Kentuchy"
)

// Adding elements to Map
states += ("AL" -> "Alabama")
states += ("AR" -> "Arkansas", "AZ" -> "Arizona")
states ++= Map("CA" -> "California", "CO" -> "Colorado")
println(states)

// Removing elements from a Map
states -= "AR"
states -= ("AL", "AZ")
states --= List("AL", "AZ")
println(states)

// Updating Map elements
states("AK") = "Alaska, A Really Big State"
println(states)

// Traversing a Map
val ratings = Map(
    "Lady in the Water"-> 3.0, 
    "Snakes on a Plane"-> 4.0,
    "You, Me and Dupree"-> 3.5
)

for ((k,v) <- ratings) println(s"key: $k, value: $v")
ratings.foreach {
    case(movie, rating) => println(s"key: $movie, value: $rating")
}

