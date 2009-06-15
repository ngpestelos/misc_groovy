package lists

// Clone a list
// See http://groovy.codehaus.org/JN1015-Collections
def list1 = ['a', 'b', 'c']
def list2 = new ArrayList(list1)
assert list2 == list1
def list3 = list1.clone()
assert list3 == list1