lst = [1, 2]

lst.identity {
  add(3)
  add(4)

  println size()
  println contains(2)
}

lst.identity {
  println "this is ${this}"
  println "owner is ${this}"
  println "delegate is ${delegate}"
}
