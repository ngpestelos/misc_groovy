// Programming Groovy, p. 107

package closure

def examiningClosure(closure) {
    closure()
}

examiningClosure() {
    println "In First Closure:"
    println "class is " + getClass().name
    println "this is " + this + ", super: " + this.getClass().superclass.name
    println "owner is " + owner + ", super: " + owner.getClass().superclass.name

    examiningClosure() {
        println "In Second Closure:"
        println "class is " + getClass().name
        println "this is " + this + ", super: " + this.getClass().superclass.name
        println "owner is " + owner + ", super: " + owner.getClass().superclass.name
    }

}