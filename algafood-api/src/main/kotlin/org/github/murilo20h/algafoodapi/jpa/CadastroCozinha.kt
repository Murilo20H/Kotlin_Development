package org.github.murilo20h.algafoodapi.jpa

import jakarta.persistence.EntityManager
import jakarta.persistence.PersistenceContext
import org.github.murilo20h.algafoodapi.domain.model.Cozinha
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
class CadastroCozinha (
    @PersistenceContext
    private val manager : EntityManager
) {
    fun listar() : List<Cozinha> = manager.createQuery("from Cozinha", Cozinha::class.java).resultList

    fun buscar(id: Long) : Cozinha = manager.find(Cozinha::class.java, id)

    @Transactional
    fun remover(cozinha: Cozinha) {
        val cozinhaEncontrada = buscar(cozinha.getId())
        manager.remove(cozinhaEncontrada)
    }

    @Transactional
    fun salvar(cozinha: Cozinha) : Cozinha = manager.merge(cozinha)
}