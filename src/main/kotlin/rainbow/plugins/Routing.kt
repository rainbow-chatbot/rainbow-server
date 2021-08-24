package rainbow.plugins

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.request.receive
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.post
import io.ktor.routing.routing

private val values = mutableListOf<String>()

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("daol.xyz 로 접속 가능")
        }

        get("/random") {
            call.respondText("사용법: /random/{items}\n아이템들은 ,로 구분")
        }

        get("/random/{items}") {
            val items = call.parameters["items"]?.split(",") ?: emptyList()
            call.respondText("추천 아이템은?! ${items.random()} 입니다.")
        }

        get("/error") {
            call.respondText("Error!!!")
        }

        get("/post") {
            call.respondText("[지금까지 받은 post]\n${values.joinToString("\n")}")
        }

        post("/post") {
            val value = call.receive(String::class)
            values.add(value)
            call.respondText(value)
        }
    }
}
