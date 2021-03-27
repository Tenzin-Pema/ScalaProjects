package lecture11

class BoomBox(var batt: Battery) extends Electronic {
  override var battery: Battery = batt

  override def use(): Unit = {
    if (battery.charge>=3){
      battery.charge-=3
    }
  }

  override def replaceBattery(batt: Battery): Battery = {
    var temp = this.battery
    this.battery = batt
    temp
  }
}
