package lecture11

object UseElectronics {


  def useAll(listElectronic: List[Electronic]): Unit ={
    for(l <- 0 to (listElectronic.length-1)){
      listElectronic(l).use()
    }
  }
  def swapBatteries(electro1: Electronic, electro2: Electronic):Unit={
    if (electro1.battery.charge>5){

    }
    if (electro1.getClass.getSimpleName =="Flashlight"){

    }
    val temp = electro1.battery
    electro1.battery = electro2.battery
    electro2.battery = temp

  }
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
    var flash1 = new Flashlight()
    var flash2 = new Flashlight()
    var boom1 = new BoomBox(new Battery(10))
    var boom2 = new BoomBox(new Battery(15))
    val fourItem:List[Electronic]= List(flash1, flash2, boom1, boom2)
    println("Flash1 is: "+ flash1.battery.charge)
    println("Flash2 is: "+ flash2.battery.charge)
    println("Boom1 is: " + boom1.battery.charge)
    println("Boom2 is: "+ boom2.battery.charge)
    useAll(fourItem)
    println("RUNNING USEALL")
    println("Flash1 is now: "+ flash1.battery.charge)
    println("Flash2 is now: "+ flash2.battery.charge)
    println("Boom1 is now: " + boom1.battery.charge)
    println("Boom2 is now: "+ boom2.battery.charge)
    println("========================================")
    println("========================================")
    var boom3:BoomBox = new BoomBox(new Battery(10))
    var flash3:Flashlight = new Flashlight()
    println("boom3 is: "+ boom3.battery.charge)
    println("flash3 is: "+ flash3.battery.charge)
    swapBatteries(boom3,flash3)
    println("RUNNING SWAPBATTERIES")
    println("boom3 is now: "+ boom3.battery.charge)
    println("flash3 is now: "+ flash3.battery.charge)

  }
}

