package com.strict.taskmicroservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TaskMicroserviceApplication

fun main(args: Array<String>) {
    runApplication<TaskMicroserviceApplication>(*args)
}
