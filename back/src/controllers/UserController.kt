package com.axbg.ctd.controllers

import com.axbg.ctd.services.UserService
import io.ktor.application.call
import io.ktor.http.HttpStatusCode
import io.ktor.response.respond
import io.ktor.routing.Routing
import io.ktor.routing.get
import io.ktor.routing.route

fun Routing.userController(userService: UserService) {
    route("/user") {
        get("/") {
            call.respond(HttpStatusCode.OK, userService.getUser())
        }
    }
}