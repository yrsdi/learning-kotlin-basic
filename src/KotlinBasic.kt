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
    //Convertion
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

    //Variable

    // Mutable
    var thisIsMutable = "This is Mutable Variable"
        thisIsMutable = "Variable can be change"
    // Immutable
    val thisIsImmutable = "This is Immutable Variable, Cannot be changed"

    println(thisIsMutable)
    println(thisIsImmutable)

    //nullable
    var nama:String? = null
    nama="Yadi"

    println(nama)
    println(nama?.length)
}