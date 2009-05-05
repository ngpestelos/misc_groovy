package dsl

def cl = this.class.classLoader
def dsl = cl.getResource("dsl/orderPizza.dsl").text
def dslDef = cl.getResource("dsl/pizza.dsl").text

def script = """
${dslDef}
acceptOrder {
    ${dsl}
}
"""

new GroovyShell().evaluate(script)

