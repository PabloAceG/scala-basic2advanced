// Iterable collection with no duplicate elements.
// Can be both mutable and immutable.
import scala.collection.mutable.Set

val set = Set[Int]()
set += 1
set += 2 += 3
set ++= Vector(4, 5)

// Trying to add a pre-existing value is ignored
println(set)
set += 2
println(set)

// The add function returns a boolean depending on if the element was added
println(set.add(5))
println(set.add(6))

// Delete elements from a Set
set -= 1
set -= (2, 3)
set --= Array(4,5)

set.clear()
println(set)

val set2 = Set(1, 2, 3, 4, 5)
// Same happens with remove method, it returns a boolean
println(set.remove(2))
println(set.remove(40))

