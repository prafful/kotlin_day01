//variables
fun main() {
    //variable is name
    //kotlin is the string value stored in name variable
    var name="Kotlin"
    var score=88
    println(name) //println prints the new line \n at the end of the output
    println(score)
    //print using $ operator
    println("$name")
    println("I am learning to code using $name. My score is $score.")
    print(name) //print does not print the new line \n at the end of the output
    print(score)
    println()
    //assigning variable value to the datatype
    var language:String //declared the variable of type String
    language = "Malay" //initialized the variable language with value -> "Malay"
    println("I want to learn $language.")

    var myname:String
    var mycountry ="Malaysia"          //allow kotlin to infer the datatype

    myname = "Prafful Daga"

    val planet = "Earth"
    println("I am from planet $planet.")
    //i want to migrate to Mars or Moon
    //planet = "Moon" //not possible
    /*
    multi line comment
    val keyword is used to create immutable variable. They are read only. Once initialized, cannot be updated.
    var keyword is used to create mutable variable. Can be updated after initialization.
     */

    //few more datatypes
    var age:Int = 77
    var status: Boolean = true
    var lifeline: Double = 88.88
    var lesslifeline:Float = 88.88F

    var n1:Int = 8
    var n2:Int = 9
    var n3:Int = n1+n2
    println("Total of n1 + n2 = $n3")
    println("Total here itself: $n1 + $n2")
    println("This works: ${n1 + n2}")

    //clash of dataypes
    var n4 = 44
    var n5 = "55"
    var n6 = n4 + n5.toInt()
    println(n6)

    //Byte -> -128 to 127
    //statically typed
    var byteValue: Byte = 127
    println("Byte value: $byteValue")

    //Short -> -32768 to 32767
    //Int -> -2 power of 31 (-2147483648) to (2 power of 31)-1 (2147483647)
    var intValue:Int = 2147483647 //max value

    //Long -> -2 power of 63 (-9,223,372,036,854,775,808) to (2 power of 63)-1 (9,223,372,036,854,775,807)
    //Float
    //Double
    var duration=44.44
    println(duration::class.simpleName)
    println(duration::class.qualifiedName)

    var durationFloat = 17.17F   //add F to make it float
    println(durationFloat::class.simpleName)
    println(durationFloat::class.qualifiedName)

    //Char
    var alphabet= '#'  //char value
    var alphabetS= "#" //string value

    //Boolean -> True / False
    var check = true

    //Arrays ->  collection of multiple values of same datatype in same variable
    //"Volvo" is the element at index position  of 0
    var carModels = arrayOf("Volvo", "Merc", "Audi" , "Toyota")
    println(carModels)
    println(carModels.toList())
    println(carModels[0])
    println(carModels[1])
    println(carModels[2])
    println(carModels[3])
    //println(carModels[4]) 4 is not the valid position. 4 is the index value which does not exist.
    println(carModels.size)   //get the size of this array
    println(carModels[carModels.size-1])

}