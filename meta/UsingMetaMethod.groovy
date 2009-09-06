str = "hello"
methodName = "toUpperCase"

methodOfInterest = str.metaClass.getMetaMethod(methodName)

println methodOfInterest.invoke(str)

print "Does String respond to toUpperCase()? "
println String.metaClass.respondsTo(str, "toUpperCase")? "yes" : "no"

print "Does String respond to toUpperCase(int)? "
println String.metaClass.respondsTo(str, "toUpperCase", 5)? "yes" : "no"
