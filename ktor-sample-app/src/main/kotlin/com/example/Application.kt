package com.example

import com.example.infrastructure.configureRouting
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import org.koin.ktor.plugin.Koin
import org.koin.logger.slf4jLogger

// based on https://github.com/InsertKoinIO/koin-getting-started/tree/main/ktor
fun main(args: Array<String>) {
    // Start Ktor
    embeddedServer(Netty, commandLineEnvironment(args)).start(wait = true)
}

fun Application.main() {
    install(Koin) {
        slf4jLogger()
        modules(appModule)
    }
    configureRouting()
}