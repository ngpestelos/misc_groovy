package meta

class Person {
  String firstname
  String lastname
}

def p = new Person(firstname: "John", lastname: "Smith")
p.properties.each { println it }

if (p.metaClass.hasProperty(p, "firstname"))
  p.firstname = "Jane"
println p.firstname
