package regex

pattern = ~"Pot"

text1 = "Potato"
text2 = "potato"
text3 = "POtato"

if (text1 =~ pattern)
    println "matched Potato"
if (text2 =~ pattern)
    println "matched potato" // oops
if (text3 =~ /(?i)potato/)   // case insensitive
    println "matched potato"