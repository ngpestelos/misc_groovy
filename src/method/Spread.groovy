def foo(a, b, c) {
  println "Foo got $a $b $c"
}

def bar(params, name) {
  println "Bar got params=$params, name=$name"
}

def baz(String name, params, conditions) {
  println "Baz got name=$name params=$params conditions=$conditions"
}

foo(1, 2, 3)
foo(*[4,5,6])

bar(one: 'e', bee: 'a', 'abc')

baz('abc', [category: 'Guns', id: 123], 'where category = ?')
