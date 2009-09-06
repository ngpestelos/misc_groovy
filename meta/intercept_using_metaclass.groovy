class Car {
  def check() { System.out.println "check called..." }
  
  def start() { System.out.println "start called..." }

  def drive() { System.out.println "drive called..." }
}

// invoke
// getMetaMethod
// invokeMissingMethod
// Use System.out.println
Car.metaClass.invokeMethod = { String name, args ->

  System.out.println("Call to $name intercepted... ")

  if (name != 'check') {
    System.out.println "running filter..."
    Car.metaClass.getMetaMethod("check").invoke(delegate, null)
  }

  // Don't forget to include this block

  def validMethod = Car.metaClass.getMetaMethod(name, args)
  if (validMethod != null) {
    validMethod.invoke(delegate, args)
  } else {
    return Car.metaClass.invokeMissingMethod(delegate, name, args)
  }

  ////

}

car = new Car()

car.start()
System.out.println ""
car.drive()
System.out.println ""
car.check()
System.out.println ""
try {
  car.speed()
} catch (ex) {
  println ex
}
