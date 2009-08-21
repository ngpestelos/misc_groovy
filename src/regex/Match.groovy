package regex

pattern = ~"(G|g)roovy"
text    = 'Groovy is Hip'

// partial match
if (text =~ pattern)
    println "match"
else
    println "no match"

// exact match
if (text ==~ pattern)
    println "match"
else
    println "no match"