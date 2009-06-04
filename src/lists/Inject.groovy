package lists

// Fold a list into a string using 'counting: ' as its initial value
// See Programming Groovy, p. 131
// See http://groovy.codehaus.org/JN1015-Collections
assert [1, 2, 3].inject('counting: '){ str, item -> str + item } == "counting: 123"

