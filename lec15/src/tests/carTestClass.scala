package tests

import lecture15.Car
import org.scalatest.FunSuite

class carTestClass extends FunSuite{
  test("Test car start in park"){
    val car = new Car
    assert(car.velocity()==0)

  }
  test("Test car driving "){
    val car = new Car
    car.shiftToDrive()
    car.accelerate()
    assert(car.velocity()==10)
    car.accelerate()
    assert(car.velocity()==20)

  }
  test("Test car braking"){
    val car = new Car
    car.shiftToDrive()
    car.accelerate()
    assert(car.velocity()==10)
    car.brake()
    assert(car.velocity()==0)
  }
  test("Test car parking while moving"){
    val car = new Car
    car.shiftToDrive()
    car.accelerate()
    assert(car.velocity()==10)
    car.shiftToPark()
    assert(car.velocity()==10)
    car.brake()
    car.shiftToPark()
  }
  test("Test car reversing"){
    val car = new Car
    car.shiftToReverse()
    car.accelerate()
    assert(car.velocity()==(-5))

    car.accelerate()
    assert(car.velocity()==(-10))
    car.shiftToPark()
    assert(car.velocity()==(-10))
    car.brake()
    assert(car.velocity()==0)
    car.shiftToDrive()
    car.accelerate()
    assert(car.velocity()==(-5))
    car.brake()
    car.shiftToPark()
    car.shiftToDrive()
    car.accelerate()
    assert(car.velocity()==10)


  }



}
