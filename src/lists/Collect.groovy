package lists

// Map a closure for each item on the list
assert [1, 2, 3].collect { it * 2 } == [2, 4, 6]

// Shorthand
assert [1, 2, 3]*.multiply(2) == [1, 2, 3].collect { it.multiply(2) }
