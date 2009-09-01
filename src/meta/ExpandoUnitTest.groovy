package meta

class ExpandoUnitTest extends GroovyTestCase {

  def pig

  void setUp() {
    GuineaPig.metaClass.blah = { -> "And then what?" }
    GuineaPig.metaClass.'static'.boo = { -> "Boo!" }
    GuineaPig.metaClass.initialize()
    pig = new GuineaPig()
  }

  void testReplaceBlah() {
    println pig.blah()
  }

  void testReplaceBoo() {
    println GuineaPig.boo()
  }

  void testExpandoMethods() {
    println GuineaPig.metaClass.getExpandoMethods()
  }

  void testGetProperties() {
    println GuineaPig.metaClass.getProperties()
  }

  void testMethodMissing() {
    println pig.snort()
  }

  static void main(args) {
    junit.textui.TestRunner.run(ExpandoUnitTest.class)
  }

}
