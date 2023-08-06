fun main() {
    //This is the first number of the assignment
    //create an array of 50 integers and use a for loop to print out the names of the integer

    val integers = Array(50) { it + 1 }
    for (number in integers) {
        println(number)
    }
}
