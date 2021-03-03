import java.io.{FileNotFoundException, IOException}

var text = ""
try {
    // openAndReadAFile is a method that does what its name implies: it opens a 
    // file and reads the text in it, assigning the result to the variable 
    // named text
    text = openAndReadAFile(filename)
} catch {
    case e: FileNotFoundException => println("Couldn't find that file.")
    case e: IOException => println("Had an IOException trying to read that file")
}
