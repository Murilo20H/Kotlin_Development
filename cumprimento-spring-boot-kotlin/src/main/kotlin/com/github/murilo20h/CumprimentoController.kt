package com.github.murilo20h

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class CumprimentoController {
    val counter: AtomicLong = AtomicLong()

//    localhost:8080/cumprimento?nome=teste
    @RequestMapping("/cumprimentar")
    fun cumprimentar(@RequestParam(value="nome", defaultValue = "World") nome: String?): Cumprimento {
        return Cumprimento(counter.incrementAndGet(), "Hello $nome")
    }

//    localhost:8080/teste
//    @RequestMapping("/{nome}")
//    fun cumprimentar(@PathVariable nome: String): Cumprimento {
//        return Cumprimento(counter.incrementAndGet(), "Hello $nome")
//    }
}