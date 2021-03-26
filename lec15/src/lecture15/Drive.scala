package lecture15

class Drive(a: Car) extends State{

  var i = 0

  override def shiftToDrive(): Unit = {
    a.state = new Drive(a)
  }
  override def shiftToPark(): Unit = {
    a.state = new Park(a)
  }
  override def shiftToReverse(): Unit = {
    println("Car is in drive... Cannot shift to reverse")
  }
  override def accelerate(): Unit = {
    println("Car is accelerating")
    a.state = new velocity1(a)
  }
  override def brake(): Unit = {
    println("Brakes enabled... Stopping the car...")
    i=0
  }
  override def velocity(): Int = {
    println("Velocity is "+ i); i
  }
}
