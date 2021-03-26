package lecture15

class Park(a: Car) extends State{
  var i = 0

  override def shiftToDrive(): Unit = {
    a.state = new Drive(a)
  }
  override def shiftToPark(): Unit = {
    println("Car is parked")
  }
  override def shiftToReverse(): Unit = {
    a.state = new Reverse(a)
  }
  override def accelerate(): Unit = {
    println("Car is parked, accelerating has no effect")
  }
  override def brake(): Unit = {
    println("Car is parked, braking has no effect")
  }
  override def velocity(): Int = {
    println("Velocity is "+ i);i
  }

}
