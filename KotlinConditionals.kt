fun main() {
    val examScore = 80
    if (examScore > 70) {
        println("You passed")
    } else {
        println("You failed")
    }

    val names = mutableListOf<String>("Ali", "Maya", "Grace")
    println(names[2])
    names.add("Raj")
    // Kotlin: The integer literal does not conform to the expected type String
    // List is of Type String
    // names.add(1)
    for ( name in names ) {
        println(name)
    }

    for ( i in 1..5){
        println(i)
    }
}