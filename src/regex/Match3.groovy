package regex

import java.util.regex.Pattern

def pattern = Pattern.compile("Pot", Pattern.CASE_INSENSITIVE)

def text1 = "Potato"
def text2 = "potato"

if (text1 =~ pattern)
    println "matched Potato"
if (text2 =~ pattern)
    println "matched potato" // yay!

