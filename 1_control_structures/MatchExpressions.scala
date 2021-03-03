val i = 10
// i is an integer
val monthName = i match {
    case 1  => "January"
    case 2  => "February"
    case 3  => "March"
    case 4  => "April"
    case 5  => "May"
    case 6  => "June"
    case 7  => "July"
    case 8  => "August"
    case 9  => "September"
    case 10 => "October"
    case 11 => "November"
    case 12 => "December"
    case _  => "Invalid month"
}
println(monthName)

// Using match expression as the body of a method
def convertBooleanToStringMessage(bool: Boolean): String = bool match {
    case true => "you said true"
    case false => "you said false"
}

val answer = convertBooleanToStringMessage(true)
println(answer)

// Handling alternate cases
def isTrue(a: Any) = a match {
    case 0 | "" => false
    case _ => true
}
println(isTrue(0))
println(isTrue(""))
println(isTrue(1.1F))
println(isTrue(new java.io.File("/etc/passwd")))



