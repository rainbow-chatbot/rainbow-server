package rainbow

import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import rainbow.plugins.configureHTML
import rainbow.plugins.configureHTTP
import rainbow.plugins.configureRouting

fun main() {
    embeddedServer(Netty, port = 80, host = "0.0.0.0") {
        configureHTML()
        configureHTTP()
        configureRouting()
    }.start(wait = true)
}
