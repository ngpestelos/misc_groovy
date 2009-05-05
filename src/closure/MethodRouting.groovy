// Programming Groovy, p. 109

package closure

class Handler {
    def f1() { println "f1 of Handler called..." }
    def f2() { println "f2 of Handler called..." }
}

class Example {
    def f1() { println "f1 of Example called..." }
    def f2() { println "f2 of Example called..." }

    def foo(closure) {
        //closure.delegate = new Handler()
        closure()
    }
}

def f1() { println "f1 of Script called..." }

// looking for f2 here?

new Example().foo {
    println this.getClass().name        // Who's this? MethodRouting.
    println delegate.getClass().name    // Handler (if set)
    f1() // Script
    f2()
}

