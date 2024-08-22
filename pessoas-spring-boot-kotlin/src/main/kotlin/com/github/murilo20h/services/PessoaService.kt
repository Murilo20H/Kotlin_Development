package com.github.murilo20h.services

import com.github.murilo20h.model.Pessoa
import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicLong
import java.util.logging.Logger

@Service
class PessoaService {

    private val counter: AtomicLong = AtomicLong()
    private val logger = Logger.getLogger(PessoaService::class.java.name)

    fun procurarPorId(id: Long): Pessoa {
        logger.info("Procurando uma pessoa")

        val pessoa = Pessoa()
        pessoa.id = counter.incrementAndGet()
        pessoa.primeiroNome = "Jorge"
        pessoa.ultimoNome = "Silva"
        pessoa.endereco = "São Paulo - SP"
        pessoa.genero = "Masculino"
        return pessoa
    }

    fun procurarTodos(): List<Pessoa> {
        logger.info("Procurando todas as pessoas")

        val pessoas: MutableList<Pessoa> = ArrayList()
        for (i in 0..7) {
            val pessoa = mockPessoa(i)
            pessoas.add(pessoa)
        }
        return pessoas
    }

    fun criarPessoa(pessoa: Pessoa): Pessoa {
        return pessoa
    }

    fun alterarPessoa(pessoa: Pessoa): Pessoa {
        return pessoa
    }

    fun deletarPessoa(id: Long) {

    }

    private fun mockPessoa(i: Int): Pessoa {
        val pessoa = Pessoa()
        pessoa.id = counter.incrementAndGet()
        pessoa.primeiroNome = "Nome da Pessoa $i"
        pessoa.ultimoNome = "Ultimo Nome $i"
        pessoa.endereco = "Endereço $i"
        pessoa.genero = "Genero $i"
        return pessoa
    }
}