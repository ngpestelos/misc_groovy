package meta

def e = new Expando()
println e.class
println e.properties

e.latitude = 70
e.longitude = 30
e.areWeLost = { ->
  return (e.longitude != 30) || (e.latitude != 70)
}

println e.areWeLost()

e.goNorth = { howMuch ->
  e.latitude += howMuch
}

println e.goNorth(20)
