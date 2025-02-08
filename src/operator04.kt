fun main() {
    // Arithmetic operators -> + , - , / , * , % (mod operator)
    // Assignment operators ->  = , += , -=, *=, %=, /=
    // Increment and decrement operators -> ++, --
    // Not operator -> !
    // Comparision operators ->  > , < , >= , <= , == , !=
    // Logical operators ->
    // OR operator -> ||
    // AND operator -> &&

    var n1 = 50
    var n2 = 3
    var s1 = "Hello"
    var s2 = "Mello"
    println(n1+n2) //+ operator for mathematical operation
    println(s1+s2) //+ operator for string concatenation/combination operation

    println("Print reminder: ${n1%n2}")
    //Arithmetic operators follow BODMAS (order of operations)
    println(50+30/2*2-2)  //output is 78
    println((50+30)/(2*2)-2) //output is 18


    //assignment operators
    n2 = n2 + 1  //increment the value inside variable n2 by 1
    println("1.Updated value of n2: $n2")
    n2 = n2 + 6  //increment the value inside variable n2 by 6
    println("2.Updated value of n2: $n2")
    n2 += 10 //is same as n2 = n2 + 10
    println("3.Updated value of n2: $n2")
    n2 *= 10 //is same as n2 = n2 * 10
    println("4.Updated value of n2: $n2")
    n2 /= 20 //is same as n2 = n2 / 20
    println("5.Updated value of n2: $n2")

    //increment and decrement operators
    var n4 = 4
    var n5 = 4
    //++n4  //same as n4 = n4 + 1
    println("6.Updated value of n4: ${++n4}")  //pre-increment
    println("7.Updated value of n5: ${n5++}")  //post-increment
    println("8.Updated value of n5: $n5")
    //both variables n4 and n5 contain 5
    println("9.Updated value of n4: ${--n4}")  //pre-increment
    println("10.Updated value of n5: ${n5--}")  //post-increment
    println("11.Updated value of n5: $n5")

    //not operator
    var check = false
    println(check)
    println(!check)

    //comparison operator
    println("Comparison operators")
    println(8>5)
    println(8<5)
    println(8<8)
    println(8<=8)
    println("Kotlin"!="Kotlin")
    println("Kotlin"=="Kotlin")

    //logical operators
    /*
    OR ||
    true or true returns true
    true or false returns true
    false or true returns true
    false or false returns false

    AND &&
    true and true returns true
    true and false returns false
    false and true returns false
    false and false returns false


     */
    println("logical operators")
    println(true || false)
    println(true && false)
    println((true||false)||(false || false) && ((true || false)&&(true ||false)))
    var n6 = 20
    var n7 = 30
    var n8 = 40
    println(((n6>n7)||(n8>n6))&&(n6+10==n7)&&((n7<n8)||(n8<n6)))
//             ( false || true) && (true) && (true || false)
//                  true        &&  true  &&      true
//                           true

}