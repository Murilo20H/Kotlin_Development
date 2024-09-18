package com.github.murilo20h.services

import com.github.murilo20h.exceptions.ResourceNotFoundException
import com.github.murilo20h.model.Pessoa
import com.github.murilo20h.repository.PessoaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.logging.Logger

@Service
class PessoaService {

    @Autowired
    private lateinit var repository: PessoaRepository
    private val logger = Logger.getLogger(PessoaService::class.java.name)

    fun procurarPorId(id: Long): Pessoa {
        logger.info("Procurando uma pessoa com o ID $id")
        return repository.findById(id)
            .orElseThrow{ ResourceNotFoundException("Nenhuma pessoa foi encontrada com o ID $id") }
    }

    fun procurarTodos(): List<Pessoa> {
        logger.info("Procurando todas as pessoas")
        return repository.findAll()
    }

    fun criarPessoa(pessoa: Pessoa): Pessoa {
        logger.info("Criando uma pessoa com o nome ${pessoa.primeiroNome}")
        return repository.save(pessoa)
    }

    fun alterarPessoa(pessoa: Pessoa): Pessoa {
        logger.info("Alterando uma pessoa com o nome ${pessoa.primeiroNome}")
        val pessoaEncontrada = repository.findById(pessoa.id)
            .orElseThrow{ ResourceNotFoundException("Nenhuma pessoa foi encontrada com o ID ${pessoa.id}") }

        pessoaEncontrada.primeiroNome = pessoa.primeiroNome
        pessoaEncontrada.ultimoNome = pessoa.ultimoNome
        pessoaEncontrada.endereco = pessoa.endereco
        pessoaEncontrada.genero = pessoa.genero
        return repository.save(pessoaEncontrada)
    }

    fun deletarPessoa(id: Long) {
        logger.info("Deletando uma pessoa com o ID $id")
        val pessoa = repository.findById(id)
            .orElseThrow{ ResourceNotFoundException("Nenhuma pessoa foi encontrada com o ID $id") }
        repository.delete(pessoa)
    }
}