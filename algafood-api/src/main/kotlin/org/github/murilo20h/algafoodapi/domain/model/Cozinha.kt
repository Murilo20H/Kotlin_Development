package org.github.murilo20h.algafoodapi.domain.model

import jakarta.persistence.*

@Entity
@Table(name = "cozinha")
data class Cozinha (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long = 0,

    @Column
    private var nome: String = ""
) {
    fun getId(): Long = id
    fun setId(id: Long) {
        this.id = id
    }

    fun getNome(): String = nome
    fun setNome(nome: String) {
        this.nome = nome
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Cozinha

        return id == other.id
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }
}