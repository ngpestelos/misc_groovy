String.metaClass.capitalize = { ->
  delegate[0].toUpperCase() + delegate[1, -1]
}

String.metaClass.'static'.dumb = { ->
  "I CAN HAS DUMB STRING"
}

println "foo".capitalize()

println String.dumb()
