package lecture11

abstract class Electronic() {
    var battery: Battery
    def use(): Unit
    def replaceBattery(batt: Battery): Battery
}
