package com.bikmay.hobi.rest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
//@EnableJpaRepositories(basePackages = arrayOf("com.bikmay.*"))
//@ComponentScan
@EntityScan("com.bikmay.hobi.rest.repo.entity")
open class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}
