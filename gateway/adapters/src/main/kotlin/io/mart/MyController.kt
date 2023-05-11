package io.mart

import io.mart.ports.SimpleRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MyController(val simpleRepository: SimpleRepository) {

    @GetMapping("/test")
    fun test(): String {
        return simpleRepository.get().name
    }
}
