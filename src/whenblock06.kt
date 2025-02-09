//similar to switch case in other programming languages

fun main() {
    print("Input any alphabet:")
    val alphabet = readLine()
    when(alphabet){
        "a"-> println("you typed a")
        "b"-> println("you typed b")
        "c"-> println("you typed c")
        "d"-> println("you typed d")
        "e"-> println("you typed e")
        else -> println("i have not learnt this alphabet yet")

    }

    //using when as expression
    val output = when(alphabet){
        "a"-> "e you typed a"
        "b"-> "e you typed b"
        "c"-> "e you typed c"
        "d"-> "e you typed d"
        "e"-> "e you typed e"
        else -> "e i have not learnt this alphabet yet"
    }
    println(output)

    /*
    switch(expression) {
      case x:
        // code block
        break;
      case y:
        // code block
        break;
      default:
        // code block
}
     */

    //using multiple values in case/check area
    println()
    println("check multiple values in when block")
    print("Input number:")
    val n1 = readLine()?.toInt()
    when (n1){
        2,4,6,8,10 -> println("n1 is even number till 10")
        1,3,5,7,9 -> println("n1 is odd number till 10")
        else -> println("n1 is greater than 10 or less than 1. out of my scope.")
    }

    //using when with in operator
    println()
    println("when with in operator")
    when(n1){
        in 0..10-> println("n1 is in range of 1 to 10")
        in 11..20-> println("n1 is in range of 11 to 20")
        in 21..50-> println("n1 is in range of 21 to 50")
        in 51..100-> println("n1 is in range of 51 to 100")
        else -> println("n1 is greater than 100. Out of scope.")
    }


}