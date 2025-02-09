//for loop can  be used to lopp through or iterate on any iterable
//iterables are like ranges, arrays, maps...

fun main() {
    for (n1 in 1..5){
        println(n1)
    }
    println()
    println("table of a number")
    //use for loop to print the table
    var n2 = 5
    for(i in 1..10){
        println("$n2 * $i = ${5*i}")
    }
    //skip curly braces if there is single statement in block of for loop
    println("skipping curly braces")
    for(i in 1..10) println("$n2 * $i = ${5*i}")

    //what if range is in reverse order
    println("working with range in reverse order")
    //this will not work -> line 22 to 24
    for (n1 in 8..4){
        println(n1)
    }
    println("reverse order")
    //use downTo to work with range in reverse order
    for (n1 in 8 downTo 4){
        println(n1)
    }
    //use step to jump in range
    println("use step to jump in range")
    for(i in 1..10 step 2){
        println("$n2 * $i = ${5*i}")
    }
    //use step with downTo
    println("step with downTo")
    for (n1 in 18 downTo 8 step 2){
        println(n1)
    }




}

/*
for loop in java
for(int i = 0; i<=5; i++){
    System.out.println(i)
}
 */
