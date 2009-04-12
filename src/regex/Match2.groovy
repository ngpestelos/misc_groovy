package regex

pattern = ~"Pot"

text1 = "Potato"
text2 = "potato"

if (text1 =~ pattern)
    println "matched Potato"
if (text2 =~ pattern)
    println "matched potato" // oops

