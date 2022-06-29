open class Person(
    age: Int,
    protected val firstName: String,
    protected val lastName: String
) {
    var age: Int

    init {
        if(age <= 0) {
            this.age = 0
        } else {
            this.age = age
        }
    }

    open fun printName() = println("$firstName $lastName")
}