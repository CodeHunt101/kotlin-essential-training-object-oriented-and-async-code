object NetworkConfig: NetworkInfoProvider {
    const val baseUrl = "http://<some url>"
    private const val userAgent = "demo-app"

    override fun getNetworkDetails(): String {
        return "$baseUrl - $userAgent"
    }
}
