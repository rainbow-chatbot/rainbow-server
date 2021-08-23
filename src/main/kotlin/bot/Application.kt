package bot

import bot.plugins.configureHTTP
import bot.plugins.configureRouting
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun main() {
    embeddedServer(Netty, port = 80, host = "0.0.0.0") {
        configureHTTP()
        configureRouting()
    }.start(wait = true)
}
