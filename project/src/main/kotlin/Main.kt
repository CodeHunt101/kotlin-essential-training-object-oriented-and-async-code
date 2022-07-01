

fun main() {
    println(NetworkConfig.baseUrl)
    println(NetworkConfig.getNetworkDetails())

    val provider: NetworkInfoProvider = object: NetworkInfoProvider {
        override fun getNetworkDetails(): String {
            println("hello")
            return ""
        }
    }
    provider.getNetworkDetails()
}

