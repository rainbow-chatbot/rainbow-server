package rainbow.plugins

import freemarker.cache.ClassTemplateLoader
import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.freemarker.FreeMarker

fun Application.configureHTML() {
    install(FreeMarker) {
        templateLoader = ClassTemplateLoader(this::class.java.classLoader, "templates")
    }
}