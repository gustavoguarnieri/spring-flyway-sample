package br.com.example.spring.flyway.sample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringFlywaySampleApplication

fun main(args: Array<String>) {
	runApplication<SpringFlywaySampleApplication>(*args)
}
