package lecture11

class Flashlight()
  extends Electronic {

  override var battery:Battery = new Battery(5)

  override def use(): Unit = {
    if (1<=battery.charge){
      battery.charge-=1
    }
  }
  override def replaceBattery(batt: Battery): Battery = {
    var temp = this.battery
    this.battery = batt
    temp
  }
}


