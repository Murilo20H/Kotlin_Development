package com.github.murilo20h.controller

import com.github.murilo20h.model.Pessoa
import com.github.murilo20h.services.PessoaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/pessoas")
class PessoaController {

    @Autowired
    private lateinit var service: PessoaService

    @GetMapping(value = ["/{id}"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun procurarPorId(@PathVariable(value="id") id: Long): Pessoa {
        return service.procurarPorId(id)
    }

    @GetMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun procurarTodos(): List<Pessoa> {
        return service.procurarTodos()
    }

    @PostMapping(consumes = [MediaType.APPLICATION_JSON_VALUE],
        produces = [MediaType.APPLICATION_JSON_VALUE])
    fun criarPessoa(@RequestBody pessoa: Pessoa): Pessoa {
        return service.criarPessoa(pessoa)
    }

    @PutMapping(consumes = [MediaType.APPLICATION_JSON_VALUE],
        produces = [MediaType.APPLICATION_JSON_VALUE])
    fun alterarPessoa(@RequestBody pessoa: Pessoa): Pessoa {
        return service.alterarPessoa(pessoa)
    }

    @DeleteMapping(value = ["/{id}"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun deletarPessoa(@PathVariable(value="id") id: Long): ResponseEntity<*> {
        service.deletarPessoa(id)
        return ResponseEntity.noContent().build<Any>()
    }
}