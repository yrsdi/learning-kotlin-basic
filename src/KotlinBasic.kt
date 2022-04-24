import java.util.Arrays

const val APP = "Kotlin Basic"
const val VERSION = "0.0.1"

fun main() {
    //output text
    var helloWorld: String = "Hello World"
    println(helloWorld)

    //input and output text
    println("What is your name?")
    var name = readLine()
    println("My Name is,  $name")

    // Data Type
    // number
    var age: Int = 30
    // float or double
    var priceDouble: Double = 100000.00
    // literal
    var binary: Int = 0b0101010101
    var hexaColor: Int = 0x000FFFF
    // Underscore on Decimal
    var priceLong: Long = 9_0000_0000_000L
    //Conversion
    var ToByte: Byte = age.toByte()
    var ToFloat: Float = age.toFloat()

    println(ToFloat)
    println(ToByte)
    println(priceLong)
    println(hexaColor)
    println(binary)
    println(priceDouble)

    //Boolean
    var yes: Boolean = true
    var no: Boolean = false
    println(yes)
    println(no)

    //Character
    var y: Char = 'Y'
    var a: Char = 'A'
    var d: Char = 'D'
    var i: Char = 'I'
    println("$y$a$d$i")

    //String
    var firstName: String = "Yadi"
    var lastName: String = "Rosadi"
    var address: String = """ 
        street not defined
        west java
        indonesia
    """.trimIndent()
    var fullName: String = "$firstName $lastName"
    var lengthFullname: String = "$fullName length is ${fullName.length}"
    println(lengthFullname)
    println(firstName)
    println(lastName)
    println(address)
    println(fullName)

    // VARIABLE
    // Mutable
    var thisIsMutable = "This is Mutable Variable"
        thisIsMutable = "Variable can be change"
    println(thisIsMutable)
    // Immutable
    val thisIsImmutable = "This is Immutable Variable, Cannot be changed"
    println(thisIsImmutable)

    // NULLABLE
    // in kotlin, normally variable is not allowed to initiate as empty value or null, so need to assign the value or it will facing error.
    // how to assign null value? kotlin has suport it but not recommended it. so when we want to initiate the value, we can add '?' after data type
    var nama:String? = "Yadi Rosadi"
    println(nama)
    // will produced error
    //println(name.length)
    // the right way to access the length without error
    println(nama?.length)
    // change variable nama to null
    nama= null
    // access the length of nama after change the value
    println(nama?.length)

    // Constant Variable
    // It's global variable & can be accessed from anywhere.
    println("This is sample of constant variable : Welcome to $APP version $VERSION")

    //Array Data Type
    // In kotlin array has allow only just one data type in one collection
    // Array is a collection of a fixed number of values
    val cities : Array<String> = arrayOf("jakarta", "bandung","semarang")
    var ages: Array<Int> = arrayOf(160,155,177)
    //accessed value by index
    println(cities[0])
    println(ages.get(0))
    //get size of array
    println(cities.size)
    println(ages.size)
    //modify one of array value
    cities.set(0, "tangerang") //or
    //cities[0] = "tangerang"
    println(cities[0])
    ages.set(1, 165)
    println(ages[1])
    //print all element of array
    println(Arrays.toString(cities))

    //Array Nullable
    val attends: Array<String?> = arrayOfNulls(5)
    attends[0] = "Yadi"
    attends[1] = "Rosadi"
    attends[2] = "joko"
    attends[3] = ""
    attends[4] = null
    println(Arrays.toString(attends))

    //Range Data Type
    //val range = 1..10
    val range = 10 downTo 1 step 3

    println(range.first)
    println(range.last)
    println(range.count())
    println(range.contains(5)) //boolean
    println(range.step)

    for (x in range) {
        println(x)
    }

}