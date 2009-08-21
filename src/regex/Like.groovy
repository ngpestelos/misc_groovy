package regex

def str = "name = ? or code = ?"

println str.replaceAll("name = \\?", "name like \\?")
//(str =~ /(name = \?) or code = \?/).replaceAll('name like ?')
//println(matcher)
//println(matcher[0][1])
//def res = matcher.replaceFirst("name like ?")
//println res
//println matcher