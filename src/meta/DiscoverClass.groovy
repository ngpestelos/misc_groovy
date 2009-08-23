package meta

def s = "Hello"
println s.class

println "Constructors..."
String.constructors.each { println it }

println "Interfaces..."
String.interfaces.each { println it }

println "Methods..."
String.interfaces.each { println it }

println evaluate("['abc' : 'def', 'ghi' : [1,2,3,4,5], 'jkl' : '100']")

println new java.util.Date().time
