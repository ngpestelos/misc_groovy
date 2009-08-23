class MyAppTest extends GroovyTestCase {
  void testDoesBusinessLogic() {
    // triangulate
    checkDoesBusinessLogic "case 1"
    checkDoesBusinessLogic "case 2"
  }

  private checkDoesBusinessLogic(param) {
    def logger = setUpLoggingExpectations(param)
    def businessObj = setUpBusinessObjectExpectations(param)
    def factory = [instance: businessObj]
    def cut = new MyApp(logger: logger, factory: factory)
    cut.doBusinessLogic(param)
  }

  private setUpLoggingExpectations(param) {
    def shouldProduceCorrectLogMessage = { msg ->
      assert msg == 'Something done with: ' + param
    }

    def logger = new Expando()
    logger.log = shouldProduceCorrectLogMessage
    return logger
  }

  private setUpBusinessObjectExpectations(param) {
    def shouldBeCalledWithInputParam = { assert it == param }
    def myObj = new Expando()
    myObj.doSomething = shouldBeCalledWithInputParam
    myObj.doSomethingElse = shouldBeCalledWithInputParam
    return myObj
  }

  static void main(args) {
    junit.textui.TestRunner.run(MyAppTest.class)
  }
}

class MyApp {
  def factory
  def logger
  def doBusinessLogic(param) {
    def myObj = factory.instance
    myObj.doSomething(param)
    myObj.doSomethingElse(param)
    logger.log("Something done with: " + param)
  }
}


