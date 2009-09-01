package meta

class GuineaPig {

  def blah() { println "Bring your blah-blah to the blah-blahtologist" }

  static def boo() { println "Replace this stuff" }

  def methodMissing(String name, args) {
    println "Alo alo ${name}"
    // Do magic here
  }

  static void main(args) {
    new GuineaPig().blah()
  }

}
