# For some reason, I couldn't get this to work

# http://jlorenzen.blogspot.com/search?q=groovy

class ProjectServiceTest extends GroovyTestCase {
  void testEmptyProject() {
    def called = false
    Project.metaClass.static.list = {[]}
    Thread.metaClass.static.startDaemon = {Closure c -> c.call()}
    JobService.metaClass.update = { called = true }
    new ProjectService(new JobService()).discover()
    assertFalse called
  }

  static void main(args) {
    junit.textui.TestRunner.run(ProjectServiceTest.class)
  }
}
