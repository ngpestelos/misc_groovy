// See http://groovy.codehaus.org/JN1015-Collections

package lists

// Returns the first match
assert [1, 2, 3].find { it > 1 } == 2

// Returns all matches
assert [1, 2, 3].findAll { it > 1 } == [2, 3]

// Returns the index of the first match
assert ['a', 'b', 'c', 'd', 'e'].findIndexOf { it in ['c', 'e', 'g'] } == 2

// Returns true if every item returns true wrt closure
assert [1, 2, 3].every { it < 5 }

assert ! [1, 2, 3].every { it < 3 }

// Returns true if any item returns true wrt closure
assert [1, 2, 3].any { it > 2 }

assert ! [1, 2, 3].any { it > 3 }