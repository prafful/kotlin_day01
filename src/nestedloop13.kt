//loop inside loop

fun main() {
    var n = 8
    for (i in 1..n){
        for (j in 1 .. n){
            print(" $j ")
        }
        println()
    }
}