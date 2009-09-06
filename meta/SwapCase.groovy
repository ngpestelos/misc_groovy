String.metaClass.swapCase = { ->
  def sb = new StringBuffer()
  delegate.each {
    sb << (Character.isUpperCase(it as char) ? Character.toLowerCase(it as char) :
      Character.toUpperCase(it as char))
  }
  sb.toString()
}

println "Foo".swapCase()
