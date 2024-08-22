package com.github.murilo20h.controller

import com.github.murilo20h.model.Pessoa
import com.github.murilo20h.services.PessoaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/pessoa")
class PessoaController {

    @Autowired
    private lateinit var service: PessoaService

    @RequestMapping(value = ["/{id}"], method = [RequestMethod.GET],
        produces = [MediaType.APPLICATION_JSON_VALUE])
    fun procurarPorId(@PathVariable(value="id") id: Long): Pessoa {
        return service.procurarPorId(id)
    }

    @RequestMapping(method = [RequestMethod.GET], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun procurarTodos(): List<Pessoa> {
        return service.procurarTodos()
    }

    @RequestMapping(method = [RequestMethod.POST], consumes = [MediaType.APPLICATION_JSON_VALUE],
        produces = [MediaType.APPLICATION_JSON_VALUE])
    fun criarPessoa(@RequestBody pessoa: Pessoa): Pessoa {
        return service.criarPessoa(pessoa)
    }

    @RequestMapping(method = [RequestMethod.PUT], consumes = [MediaType.APPLICATION_JSON_VALUE],
        produces = [MediaType.APPLICATION_JSON_VALUE])
    fun alterarPessoa(@RequestBody pessoa: Pessoa): Pessoa {
        return service.alterarPessoa(pessoa)
    }

    @RequestMapping(value = ["/{id}"], method = [RequestMethod.DELETE],
        produces = [MediaType.APPLICATION_JSON_VALUE])
    fun deletarPessoa(@PathVariable(value="id") id: Long) {
        return service.deletarPessoa(id)
    }
}