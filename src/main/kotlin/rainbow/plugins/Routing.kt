package rainbow.plugins

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.freemarker.FreeMarkerContent
import io.ktor.request.receive
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.post
import io.ktor.routing.routing
import rainbow.model.Chat

private val chats = mutableListOf<Chat>()

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("www.daol.xyz 로 접속 가능")
        }

        get("{senderId}") {
            val senderId = call.parameters["senderId"]!!.toInt()
            val chat = chats.last { it.senderId.low == senderId }
            call.respond(FreeMarkerContent("message.ftl", mapOf("message" to chat)))
        }

        post("user-chat") {
            val chat = call.receive<Chat>()
            chats.add(chat)
            call.respondText("생성 완료\n\nhttp://www.daol.xyz/${chat.senderId.low}")
        }
    }
}
