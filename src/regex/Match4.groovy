package regex

import java.util.regex.Pattern

matcher = "Potato potchi" =~ /(P|p)ot/
println "Size of matcher is ${matcher.size()}"