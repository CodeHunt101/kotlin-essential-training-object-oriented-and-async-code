

fun main() {
    val task1 = Task("a1","Build search feature")
    val task2 = Task("b2","Add Analytics")

    println(task1.name)
    println(task2.name)

    val task2Copy = task2.copy(id = "c3")

    val (id, name) = task1

    if (task2Copy == task2) {
        println("Tasks are the same")
    } else {
        println("Tasks are different")
    }
}