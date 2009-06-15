package lists

[1, 2, 3].each { println "Item: $it" }
['a', 'b', 'c'].eachWithIndex { it, i -> println "$i: $it" }