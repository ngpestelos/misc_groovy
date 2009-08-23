use(InternetUtils) {
  println "http://localhost:8080/".get()
  println "http://search.yahoo.com/search".get("p=groovy")

  def params = [:]
  params.n = "10"
  params.vl = "lang_eng"
  params.p = "groovy"
  println "http://search.yahoo.com/search".get(params)
}

class InternetUtils {
  static String get(String self) {
    return self.toURL().text
  }

  static String get(String self, String queryString) {
    def url = self + "?" + queryString
    return url.get()
  }

  static String get(String self, Map params) {
    def list = []
    params.each { k, v ->
      list << "$k=" + URLEncoder.encode(v)
    }
    def url = self + "?" + list.join("&")
    return url.get()
  }
}
