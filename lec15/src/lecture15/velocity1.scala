package lecture15

class velocity1(a: Car) extends State{
  var i = 10

  override def shiftToDrive(): Unit = {
    a.state = new Drive(a)
  }
  override def shiftToPark(): Unit = {
    println("Car cannot shift to park while moving")

  }
  override def shiftToReverse(): Unit = {
    println("Car is in drive... Cannot shift to reverse")
  }
  override def accelerate(): Unit = {
    println("Car is accelerating")
    i += 10

  }
  override def brake(): Unit = {
    println("Brakes enabled... Stopping the car...")
    a.state = new Drive(a)
  }

  override def velocity(): Int = {
    println("Velocity is "+ i); i

  }
}

