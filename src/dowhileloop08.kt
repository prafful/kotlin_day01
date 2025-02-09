fun main() {
    var n = 0
    do {
        println(n)
    } while(n>0)
    println("outside do while")
    //another example
    var n1:Int?
    do {
        print("Input any number. Input 0 to exit:")
        n1 = readLine()?.toInt()
        println("Your input: $n1")
    }while(n1 != 0)
    println("Thank you. Bye.")
}