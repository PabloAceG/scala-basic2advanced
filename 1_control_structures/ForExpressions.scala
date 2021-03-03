val nums = Seq(1,2,3)
val doubleNums = for(n <- nums) yield n * 2
println(doubleNums)

// Capitalizing Strings
val names = List("adam", "david", "frank")
val ucNames = for (n <- names) yield n.capitalize
println(ucNames)

// Using block of code after yield
val names2 = List("_adam", "_david", "_frank")
val capNames = for (n <- names2) yield {
    val nameWithoutUnderscore = n.drop(1)
    val capName = nameWithoutUnderscore.capitalize
    capName
}
println(capNames)

// val capNames = for (name <- names) yield name.drop(1).capitalize
// val capNames = for (name <- names) yield { name.drop(1).capitalize }

