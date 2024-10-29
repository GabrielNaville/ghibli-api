package com.example.kotlingradle

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class KotlinGradleApplication

fun main(args: Array<String>) {
    runApplication<KotlinGradleApplication>(*args)
}
