fun main() {
    println("Input your name:")
    var userName = readLine()
    println("Hello, $userName. Welcome to class of Kotlin.")

    print("Input number n1: ")
    var n1 = readLine()
    println()
    print("Input number n2: ")
    var n2 = readLine()
    println()
    println("Total: ${n1 + n2}")

    //
    print("Input number n3: ")
    var n3 = readLine()?.toInt() //? allows use to ensure that value returned from this statement is not null
    println()
    print("Input number n4: ")
    var n4 = readLine()?.toInt()
    println()
    println("Total: ${n3!! + n4!!}")

    //!! throws the null pointer exception if the value of null

}