/*
group of statements which can be executed together when called as per necessity
 */


fun main() {
    welcome()
    welcomeResue("Javascript")
    welcomeResue("Lua")
    var sumTotal = addition(12.0, 13.0)
    println("operation() function returns: $sumTotal")
    var output1 = operation(12.8, 2.2, "*")
    var output2 = operation(12.8, 2.2, "+")
    println("Output1 multi: $output1")
    println("Output2 add: $output2")
    var output3 = operationDefault()
    println("Output3 no parameter supplied: $output3")
    var output4 = operationDefault(5.0, 3.0)
    println("Output4 n1 and n2 supplied: $output4")
    //calculate area
    var area1 = area()
    println("area1 no parameters: $area1")
    var area2 = area(4.0)
    println("area2 length supplied: $area2")
    var area3 = area(width = 20.0)
    println("area3 width supplied: $area3")
    //use named parameters to change the sequence of parameters when you
    //make function call
    var output5 = operationDefault(operator = "/", n2=10.0, n1= 120.0)
    println("Output5 sequence of parameters changed: $output5")
}

//user defined function
fun welcome(){
    println("Welcome to Kotlin")
    println("Kotlin can be used to create Android apps")
    println("Kotlin is used to create multi-platform apps")
}

//user defined function
fun welcomeResue(language:String){
    println("Welcome to $language")
    println("$language can be used to create Android apps")
    println("$language is used to create multi-platform apps")
}

//function also return values when necessary
fun addition(n1:Double, n2:Double): Double {
    var sum:Double
    sum = n1 + n2
    return sum
}

//multiple function parameters of different data-types
fun operation(n1:Double, n2:Double, operator:String):Double{
    var result = when(operator){
        "+"->n1+n2
        "-"->n1-n2
        "/"->n1/n2
        "*"->n1*n2
        else->0.0
    }
    return result
}

//default arguments
fun operationDefault(n1:Double=1.0, n2:Double=1.0, operator:String="+"):Double{
    var result = when(operator){
        "+"->n1+n2
        "-"->n1-n2
        "/"->n1/n2
        "*"->n1*n2
        else->0.0
    }
    return result
}

//named arguments
fun area(length:Double = 2.0, width:Double=4.0):Double{
    return length*width
}