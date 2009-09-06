carA = new Expando()
carB = new Expando(year: 2007, miles: 0)

carA.year = 2007
carA.miles = 10

println "carA: " + carA
println "carB: " + carB

car = new Expando(year: 2007, miles: 0, turn: { println "turning..." })
car.drive = {
  miles += 10
  println "$miles miles driven"
}

car.drive()
car.turn()

data = new File("car.dat").readLines()

props = data[0].split(", ")

data -= data[0]

def averageMilesDrivenPerYear = { miles.toLong() / (2008 - year.toLong()) }

cars = data.collect {
  car = new Expando()
  it.split(", ").eachWithIndex { value, index ->
    car[props[index]] = value
  }

  car.ampy = averageMilesDrivenPerYear

  car
}

props.each { name -> print "$name " }
println " Avg. MPY"

ampyMethod = 'ampy'
cars.each { car ->
  for(String property : props) { print "${car[property]} " }
  println car."$ampyMethod"()
}

// Access properties by name
