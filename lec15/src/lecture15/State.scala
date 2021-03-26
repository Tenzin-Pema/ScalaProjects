package lecture15

abstract class State {

  def shiftToDrive(): Unit
  def shiftToPark(): Unit
  def shiftToReverse(): Unit
  def accelerate(): Unit
  def brake(): Unit
  def velocity(): Int

}
