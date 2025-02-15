//class in object oriented programming

//create a class using class keyword
//define constructor by making a Car class receive some parameters
class CarModel(color:String){

    /*
        by default all class variables and methods are public
     */
    //Car class property OR member variables
    private var engineStatus:Boolean = false        //cannot access engineStatus using instance as it is private
    var carColor: String = color

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

fun main() {
    //create Car instance variable
    var car1:CarModel = CarModel("Maroon")
    var car2:CarModel = CarModel("Silver")

    car1.printCarColor()
    car2.printCarColor()
}