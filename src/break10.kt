/*
break is used to exit the iteration/loop in between
 */

fun main() {
    var i:String
    while (true){
        print("Input anything. Input 0 to exit:")
        i = readLine().toString()
        println("Your input: $i")
        if(i == "0") {
            println("break out of the loop")
            break
        }
    }
    println("out of the loop")
}