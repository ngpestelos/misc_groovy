class Person {
  String name
  Map relationships = [:]

  Object invokeMethod(String what, Object who) {
    if (relationships.containsKey(what)) {
      who.each { thisPerson ->
        relationships.get(what).add(thisPerson)
      }
    } else {
      relationships.put(what, who as List)
    }
  }
}

def scott = new Person(name: "Scott")
scott.married "Kim"
scott.knows "Neal"
scott.workedWith "Brian"
scott.knows "Venkat"
scott.workedWith "Jared"
scott.knows "Ted", "Ben", "David"

println scott.relationships
println scott.relationships.married
