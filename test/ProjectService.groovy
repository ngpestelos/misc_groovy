class ProjectService {
  def jobService

  def ProjectService(jobService) {
    this.jobService = jobService
  }

  def discover() {
    Project.list().each {
      Thread.startDaemon {
        jobService.update(it)
      }
    }
  }

  static void main(args) {
  }
}
