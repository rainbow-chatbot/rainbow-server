package rainbow.plugins

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.request.receive
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.post
import io.ktor.routing.routing
import rainbow.model.Message

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("www.daol.xyz 로 접속 가능")
        }

        post("user-chat") {
            val formParameters = call.receive<Message>()
            /*val messages = formParameters
            println(messages)
            call.respondText(messages ?: "receive null value")*/
            println(formParameters)
        }
    }
}
