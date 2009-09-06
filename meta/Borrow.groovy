class Person {
  String name
}

class MortgageLender {
  def borrowMoney() {
    "buy house"
  }
}

def lender = new MortgageLender()
Person.metaClass.buyHouse = lender.&borrowMoney

def p = new Person() 
println p.buyHouse()
