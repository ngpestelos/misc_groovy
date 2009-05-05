package dsl

def dslDef = new File('/n/groovy/misc_groovy/src/dsl/GroovyPizzaDSL.groovy').text
def dsl = new File('/n/groovy/misc_groovy/src/dsl/orderPizza.dsl').text

def script = """
${dslDef}
acceptOrder {
    ${dsl}
}
"""

new GroovyShell().evaluate(script)

