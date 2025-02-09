//example of using break with range

fun main() {
    for (i in 1..20){
        println(i)
        if (i==18)break
    }
    println("outside range loop")
}