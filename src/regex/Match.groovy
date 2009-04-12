package regex

pattern = ~"(G|g)roovy"
text    = 'Groovy is Hip'

if (text =~ pattern)
    println "match"
else
    println "no match"

if (text ==~ pattern)
    println "match"
else
    println "no match"