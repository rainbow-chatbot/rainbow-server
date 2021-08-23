package bot.plugins

import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.features.CORS

fun Application.configureHTTP() {
    install(CORS) {
        anyHost()
    }
}
