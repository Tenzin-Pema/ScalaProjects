package lecture15

class velocityR(a: Car) extends State {

  var i: Int = -5

  override def shiftToDrive(): Unit = {
    println("Car cannot shift to drive")
  }
  override def shiftToPark(): Unit = {
    println("Car cannot shift to Park")
  }

  override def shiftToReverse(): Unit = {
    println("Car is in reverse")
  }

  override def accelerate(): Unit = {
    println("Car is accelerating")
    i -= 5
  }

  override def brake(): Unit = {
    println("Car is stopping")
    a.state = new Reverse(a)
  }

  override def velocity(): Int = {

    println("Velocity is "+ i);i
  }
}
