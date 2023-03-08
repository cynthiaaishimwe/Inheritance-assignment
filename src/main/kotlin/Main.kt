fun main(){
 var car = Car("volkswagen","sedan","grey",6)
   car.carry(6)
   car.carry(10)
    car.identity()
    println(car.calculateParkingfees(3))

    var bus = Bus("scania","toyota","white",2)
   println(bus.maxTripFare(30.0))
    bus.carry(5)
    bus.identity()
 println( bus.calculateParkingfees(3))

}
open class Car( var make:String,var model:String, var color:String, var capacity: Int){

    fun carry(people: Int){

      var x = people-capacity
        if(capacity>=people){
          println("carrying $people passengers")}
        else{
            println("over capacity by $x people")
        }
            }
    fun identity(){
        println("i am a $color $make $model ")
    }
    open fun calculateParkingfees(hours: Int): Int {
       var parkingfees= hours*20
        return parkingfees
    }
        }
 class Bus( make: String,model: String,color: String, capacity: Int) :Car(make,model,color,capacity){

     fun maxTripFare(fare: Double): Double{
         return fare * capacity
     }

     override fun calculateParkingfees(hours: Int): Int {
         return super.calculateParkingfees(hours)
     }

 }

