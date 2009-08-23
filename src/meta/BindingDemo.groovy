package meta

def d = new Date()
def binding = new groovy.lang.Binding()
binding.setVariable("d", d)
def gs = new GroovyShell(binding)

d.class.methods.each { method ->
  if (method.name.startsWith("get")) {
    print "${method.name}: "
    gs.evaluate("println d.${method.name}()")
  }
}
