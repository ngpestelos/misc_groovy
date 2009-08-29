def today = new Date()
println "Today ${today}"

def tomorrow = today + 1
println "Tomorrow ${tomorrow}"

def yesterday = today - 1
println "Yesterday ${yesterday}"

def d = today.clone()
println "Tomorrow also ${d.next()}"
println "Yesterday also ${d.previous()}"
