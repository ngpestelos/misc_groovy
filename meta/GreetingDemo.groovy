package meta

class Greeting {
  def sayHello() {
    println "Hello, Stranger"
  }

  def sayHello(String name) {
    println "Hello, ${name}"
  }

  def sayHello(params, name) {
    println "Hello, ${name} ${params}"
  }

  def sayHello(params, name, other) {
    println "Hello, ${name} ${params} ${other}"
  }
}

def g = new Greeting()
if (g.metaClass.respondsTo(g, "sayHello", null)) {
  g.sayHello()
}

if (g.metaClass.respondsTo(g, "sayHello", String)) {
  g.sayHello("Jane")
}

if (g.metaClass.respondsTo(g, "sayHello", String, Map)) {
  g.sayHello("John", foo: 1, bar: 2)
}

if (g.metaClass.respondsTo(g, "sayHello", String, Map, String)) {
  g.sayHello("John", foo: 1, bar: 2, "and then some")
}
