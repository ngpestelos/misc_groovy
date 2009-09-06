class Handler {
  def f1() { println "f1 of Handler called ..." }
  def f2() { println "f2 of Handler called ..." }
}

class Example {
  def f1() { println "f1 of Example called ..." }
  def f2() { println "f2 of Example called ..." }

  def foo(closure) {
    closure.delegate = new Handler()
    closure()
  }
}

def f1() { println "f1 of Script called ..." }

new Example().foo {
  f1()
  f2()
}
