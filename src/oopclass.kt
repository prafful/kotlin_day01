//class in object oriented programming

//create a class using class keyword
class Car{

    //Car class property OR member variables
    var engineStatus:Boolean = false
    var carColor: String = "White"

    //Car class methods/functions
    fun startEngine(){
        engineStatus = true
        println("Engine started: $engineStatus")
    }

    fun turnOffEngine(){
        engineStatus = false
        println("Engine turned off: $engineStatus")
    }

    fun printCarColor(){
        println("Car color is: $carColor")
    }

}

//using Carr class in main function
//create instances of Car class and then use it in main function
fun main() {
    //create instance of type Car class
 var vellfire1:Car = Car()
    var vellfire2:Car = Car()
    var gls1:Car = Car()

    //this will not work as memory has not been alloted
    var gls2:Car

    vellfire1.startEngine()
    vellfire1.turnOffEngine()
    vellfire1.printCarColor()
    //change car color for vellfire1 instance
    vellfire1.carColor = "Red"
    vellfire1.printCarColor()

    println()
    //change car color for vellfire2 instance
    vellfire2.carColor = "Gold"
    vellfire2.printCarColor()

    println()
    gls1.carColor = "Pink"
    gls1.printCarColor()


}












