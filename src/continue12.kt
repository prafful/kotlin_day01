//continue allows you to skip the specif iteration for which testexpression returns true
fun main() {

    for (i in 1..10){
        if(i==5){
            println("i will skip this loop. Loop can continue after me")
            continue
        }
//        if(i==8){
//            continue
//        }
        println("i am executed")
        println(i)
        println("I am still in loop")
    }
    println("outside the range")

}