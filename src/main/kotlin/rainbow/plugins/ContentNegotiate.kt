package rainbow.plugins

import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.features.ContentNegotiation

fun Application.configureContentNegotiate() {
    install(ContentNegotiation) {
    }
}
