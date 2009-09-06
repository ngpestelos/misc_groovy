def gets() {
  def isr = new InputStreamReader(System.in)
  new BufferedReader(isr).readLine()
}

def shell = new GroovyShell()
println "Welcome! (Ctrl-C to exit)"
while (1) {
  print ">> "
  shell.evaluate(gets())
}
