class Book {
  String title
}

Book.metaClass.constructor << { String title -> new Book(title: title) }

def b = new Book("The Stand")

println b.title
