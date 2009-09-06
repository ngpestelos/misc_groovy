Integer.metaClass.rand = { ->
  def r = new Random()
  return r.nextInt(delegate.intValue())
}

15.times { println 10.rand() }
