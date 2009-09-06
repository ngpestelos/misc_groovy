def printInfo(obj) {
  // Assume user entered these values from standard input
  usrRequestedProperty = 'bytes'
  usrRequestedMethod = 'toUpperCase'

  println obj[usrRequestedProperty]
  println obj."$usrRequestedProperty"

  println obj."$usrRequestedMethod"()
  println obj.invokeMethod(usrRequestedMethod, null)
}

printInfo("hello")

// Show each property
println "Properties of 'hello' are: "
"hello".properties.each { println it }
