def doSomething(closure) {

  if (closure) { return closure() }

  println "Using default implementation"

}

doSomething() { println "Use specialized implementation" }

doSomething()
