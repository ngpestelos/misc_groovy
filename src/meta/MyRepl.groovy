def gets() {
  def isr = new InputStreamReader(System.in)
  new BufferedReader(isr).readLine()
}

println "Welcome! (Ctrl-C to exit)"
while (1) {
  print ">> "
  println gets()
}
