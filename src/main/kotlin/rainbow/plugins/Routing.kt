package rainbow.plugins

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.freemarker.FreeMarkerContent
import io.ktor.request.receiveParameters
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.post
import io.ktor.routing.routing
import rainbow.model.RandomResult

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("www.daol.xyz 로 접속 가능")
        }

        get("/random") {
            call.respondText("사용법: /random/{items}\n아이템들은 ,로 구분")
        }

        get("/random/{items}") {
            val items = call.parameters["items"]?.split(",") ?: emptyList()
            val randomResult = RandomResult(all = items.joinToString(", "), result = items.random())
            call.respond(FreeMarkerContent("random.ftl", mapOf("random" to randomResult)))
        }

        post("user-chat-list") {
            val formParameters = call.receiveParameters()
            val messages = formParameters["messages"]
            println(messages)
            call.respondText(messages ?: "receive null value")
        }
    }
}
