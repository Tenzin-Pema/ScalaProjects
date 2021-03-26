package lecture15

class Reverse(a: Car) extends State {
  var i: Int = 0

  override def shiftToDrive(): Unit = {
    println("Car cannot shift to drive")
  }
  override def shiftToPark(): Unit = {
    a.state = new Park(a)
  }

  override def shiftToReverse(): Unit = {
    println("Car is in reverse")
  }

  override def accelerate(): Unit = {
    println("Car is accelerating")
    a.state = new velocityR(a)
  }
  override def brake(): Unit = {
    println("Car is stopping")
    i=0
  }
  override def velocity(): Int = {

    println("Velocity is "+ i);i
  }
}
