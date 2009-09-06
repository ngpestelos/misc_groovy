class Person {}

def emc = new ExpandoMetaClass(Person)
emc.sing = { ->
  "oh baby baby..."
}

emc.initialize()

def jack = new Person()
def paul = new Person()

jack.metaClass = emc

println jack.sing()

try {
  paul.sing()
} catch (ex) {
  println ex
}
