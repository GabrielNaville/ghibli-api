package com.example.kotlingradle.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.example.kotlingradle.service.GhibliService

@RestController
@RequestMapping("/api/v1/ghibli")
class GhibliController (private val ghibliService: GhibliService) {
    @GetMapping("/films")
    fun getFilm(): ResponseEntity<String> {
        val response = ghibliService.getFilm()
        val responseBody = response.body?.string() ?: "Not Find"

        return if (response.isSuccessful) {
            ResponseEntity.ok(responseBody)
        } else {
            ResponseEntity.badRequest().body(responseBody)
        }
    }

    @GetMapping("/people")
    fun getPeople(): ResponseEntity<String> {
        val response = ghibliService.getPeople()

        val responseBody = response.body?.string() ?: "Not Find"

        return if (response.isSuccessful) {
            ResponseEntity.ok(responseBody)
        } else {
            ResponseEntity.badRequest().body(responseBody)
        }
    }
}