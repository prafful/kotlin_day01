//if condition statement
/*
if (5>7){
    //this block is executed only if test expression returns true
}
 */
//if else statement
/*
if (testexpression){
    //this block is executed only if test expression returns true
}else{
    //this block is executed only if test expression returns false
}
 */
fun main() {
    val score= -8
    //if condition statement
    println("if condition statement scenario")
    if (score>0){
        println("score i greater than 0.")
    }
    println("I am outside if block")
    println()
    println("if else condition statement scenario")
    //if else condition
    if (score>0){
        println("score is greater than 0.")
    }else{
        println("score is less than 0")
    }

    //use if as expression
    println()
    println("using if as expression")
    var lifeline = 70
    var strength = if (lifeline>80){
        "Strength is good"
    }else{
        "You need to get strong. Do some workouts."
    }
    println(strength)
    //skip the curly braces if there is only one line is blocks
    println()
    println("Skipping the curly braces")
    lifeline = 99
    strength = if (lifeline>80) "Strength is good" else "You need to get strong. Do some workouts."
    println(strength)
    //ternary operator is not available in kotlin
    // var output = expression ? if expression returns true: if expression return false
    //if else ladder
    println()
    println("if else ladder")
    val universalnumber = -10
    if (universalnumber > 0)
        println("greater than zero")
    else if (universalnumber < 0)
        println("less than zero")
    else
        println("it is zero")

    println()
    println("nested if blocks")
    //nested if blocks
    val myscore=400
    if (myscore < 40){
        println("You did not qualify")
        if(myscore <= 30){
            println("You are far from getting qualified. Work very hard.")
        }
    }else if(myscore >=40 && myscore<=100){
        println("You qualified")
        if(myscore>=40 && myscore<=60){
            println("You can do better")
        }else if(myscore>60 && myscore<=80){
            println("You are doing good. Maintain it.")
        }else if(myscore > 80 && myscore <=100){
            println("Excellent")
        }
    }else{
        println("Invalid score")
    }
}