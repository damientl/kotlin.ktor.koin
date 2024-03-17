package com.example.infrastructure

import com.example.application.BuyManager
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.core.parameter.parametersOf
import org.koin.ktor.ext.inject

fun Application.configureRouting() {

    // Lazy inject HelloService
    val manager : BuyManager by inject<BuyManager>(){parametersOf(this)}

    // Routing section
    routing {
        post("/buy") {
            call.respondText(manager.buy())
        }

    }
}
