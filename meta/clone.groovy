a = ["a" : 1]
b = a.clone()
println a == b

b["b"] = 2
println b
println a
println a == b
