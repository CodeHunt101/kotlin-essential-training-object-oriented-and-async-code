

fun main() {
    val direction: Direction = Direction.WEST

    println(direction.name)
    println(direction.ordinal)

    val parsedDirection = Direction.valueOf("WEST")
    println(parsedDirection)

    val apiValue = Direction.values()[2]
    println(apiValue)

    val color = HighlightColor.BLUE
    println(color.value)
}