package com.networknt.petstore.handler

import com.networknt.handler.LightHttpHandler
import io.undertow.server.HttpServerExchange
import io.undertow.util.HttpString

class PetsPostHandler : LightHttpHandler {
    
    @Throws(Exception::class)
    override fun handleRequest(exchange: HttpServerExchange) {
        exchange.responseHeaders.add(HttpString("Content-Type"), "application/json")
        exchange.responseSender.send("{}")
    }
}
