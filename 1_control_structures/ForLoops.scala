// For loop
val nums = Seq(1,2,3)
for (n <- nums) println(n)

val people = List(
    "Bill", 
    "Candy",
    "Karen",
    "Leo",
    "Regina"
)
for (p <- people) println(p)

// For Each
nums.foreach(println)
people.foreach(println)

// For and For Each in Maps
val ratings = Map(
    "Lady in the Water"  -> 3.0,
    "Snakes on a Plane"  -> 4.0,
    "You, Me and Dupree" -> 3.5
)
for ((name, rating) <- ratings) println(s"Movie: $name, Rating: $rating")

ratings.foreach {
    case(movie, rating) => println(s"key: $movie, value: $rating")
}

