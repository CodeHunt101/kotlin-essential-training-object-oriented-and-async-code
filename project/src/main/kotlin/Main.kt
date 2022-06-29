interface StringProvider {
    val placeholder: String
    fun getString(id: Int): String = id.toString()
}

interface ResourceProvider : StringProvider {
    fun getDimension(id: Int): Long = id.toLong()
}

class DefaultResourceProvider : ResourceProvider {

    override val placeholder: String = "<placeholder>"
    override fun getDimension(id: Int): Long {
        return id.toLong() + 1
    }

}

fun main() {
    val someVariable: Any? = null

    if (someVariable is StringProvider) {
        println("The var was a StringProvider")
    }

    val stringProvider: StringProvider = DefaultResourceProvider()
    println(stringProvider.getString(5))
    println(stringProvider.placeholder)

    val defaultResourceProvider: ResourceProvider = DefaultResourceProvider()
    println(defaultResourceProvider.getDimension(1))
}