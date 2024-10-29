package com.example.kotlingradle.service

import com.example.kotlingradle.external.ExternalApiCaller
import okhttp3.Response
import org.springframework.stereotype.Service

@Service
class GhibliService(private val externalApiCaller: ExternalApiCaller) {
     fun getFilm(): Response {
        val response = externalApiCaller.filmApiCall()
        return response
    }

    fun getPeople(): Response {
        val response = externalApiCaller.peopleApiCall()
        return response
    }
}