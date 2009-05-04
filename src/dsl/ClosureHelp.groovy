package dsl

def getPizza(closure) {
    PizzaShop pizzaShop = new PizzaShop()
    closure.delegate = pizzaShop
    closure()
}

time = getPizza {
    setSize Size.LARGE
    setCrust Crust.THIN
    setTopping "Olives", "Onions", "Bell Pepper"
    setAddress "101 Main St., ..."
    setCard(CardType.VISA, "1234-1234-1234-1234")
}

printf "Pizza will arrive in %d minutes\n", time

