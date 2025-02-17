//class in object oriented programming

//create a class using class keyword
class Car{

    /*
        by default all class variables and methods are public
     */
    //Car class property OR member variables
    private var engineStatus:Boolean = false        //cannot access engineStatus using instance as it is private
    var carColor: String = "White"

    //get the engineStatus
    fun printEngineStatus(){
        if (engineStatus)
            println("Car engine is on")
        else
            println("Car engine is off")
    }

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

   private fun changeOilFilter(doit: Boolean){
        if (doit)
            println("Oil filter changed")
        else
            println("Oil filter not changed")
    }

    private  fun changeAirFilter(doit: Boolean){
        if (doit)
            println("Air filter changed")
        else
            println("Air filter not changed")
    }

    private fun updateCoolant(doit: Boolean){
        if (doit)
            println("Coolant updated")
        else
            println("Coolant not updated")
    }

    fun maintenance(oil:Boolean, air:Boolean, coolant:Boolean){
        changeOilFilter(oil)
        changeAirFilter(air)
        updateCoolant(coolant)
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

    println()
    //change engine status
    vellfire1.carColor = "Green"
    vellfire1.printEngineStatus()

    println()
    vellfire1.maintenance(true, air = true, coolant = true)
    println()
    gls1.maintenance(oil = false, air = false, coolant = true)
}












