package ru.ruslanredo.restful

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RestfulApplication

fun main(args: Array<String>) {
	runApplication<RestfulApplication>(*args)
}
